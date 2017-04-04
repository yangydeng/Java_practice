
public class heapApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Heap h1 = new  Heap(8);
		h1.insert(50);
		h1.insert(65);
		h1.insert(7);
		h1.insert(9);
		h1.insert(1);
		h1.insert(100);
		h1.insert(30);
		h1.disp();
		h1.remove();
		h1.disp();

	}

}

class Node{   //the heap is composed by nodes;
	private int iData;
	public Node(int key) {
		iData = key;
	}
	
	public int getKey() {
		return iData;
	}
	public void setKey(int key) {
		iData = key;
	}
}

class Heap{
	private Node[] heapArray;
	private int maxSize;
	private int currentSize;
	
	public Heap(int mx) {
		maxSize = mx;
		currentSize = 0;
		heapArray = new Node[maxSize];
	}
	
	public boolean isEmpty() {
		return currentSize==0;
	}
	
	public boolean insert(int key) {
		if (currentSize==maxSize) {  // if array is full, then return;
			return false;
		}
		Node newNode = new Node(key);
		heapArray[currentSize] = newNode;
		trickleUp(currentSize);
		currentSize++;
		return true;
	}
	
	public void trickleUp(int index) {
		int parent = (index-1)/2;
		Node bottom = heapArray[index];
		while (index>0   //to make sure not out of boundary
				&& heapArray[parent].getKey() < bottom.getKey()) {
			heapArray[index] = heapArray[parent];
			index = parent;
			parent = (parent-1)/2;    // default 3/2=1
		}
		heapArray[index] = bottom;
	}
	
	public Node remove() {
		Node root = heapArray[0];
		heapArray[0] = heapArray[--currentSize];
		trickleDown(0);
		return root;
	}
	
	public void trickleDown(int index) {
		int largerChild;
		Node top = heapArray[index];
		while (index < currentSize/2) {
			int leftChild = 2*index+1;   // leftChild & rightChild are indexs;
			int rightChild = 2*index+2;
			if (rightChild<currentSize   // make sure the node has rightChild;
					&& heapArray[leftChild].getKey()<heapArray[rightChild].getKey()) {
				largerChild = rightChild;
			}
			else {
				largerChild = leftChild;
			}		//compare the left and right, to find the bigger one.
			if (top.getKey()>=heapArray[largerChild].getKey()) {
				break;
			}
			heapArray[index] = heapArray[largerChild];
			index = largerChild;
		}
		heapArray[index] = top;
		
	}
	
	public void disp() {
		for (int i = 0; i < currentSize; i++) {
			System.out.print(heapArray[i].getKey()+"->");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
}