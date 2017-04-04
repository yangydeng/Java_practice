
public class practice_heap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		heapLink h1 = new heapLink(7);
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

class Link{
	int data;
	public Link(int key) {
		data = key;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int key) {
		data = key;
	}
}


class heapLink{   // make the root become the biggest one;
	int maxsize;
	int currIndex=0;
	Link[] linkArray;
	
	public heapLink(int mx) {
		maxsize = mx;
		linkArray = new Link[mx];
	}
	
	public void insert(int key) {
		if (currIndex==maxsize) {
			System.out.println("heap array is full.");
			return;
		}
		Link newLink = new Link(key);
		linkArray[currIndex] = newLink;
		trickleUp(currIndex);
		currIndex++;
		
	}
	
	public void trickleUp(int index) {
		int parent = (index-1)/2;
		Link bottom = linkArray[index];
		while (index>0 &&  // when index hit the root, should stop;
				linkArray[parent].getData()<bottom.getData()) {
			linkArray[index] = linkArray[parent];
			index = parent;
			parent = (parent-1)/2;
			System.out.println("index: "+index);
		}
		linkArray[index] = bottom;
	}
	
	public void remove() {
		//Link root = linkArray[0];
		linkArray[0] = linkArray[--currIndex];
		trickleDown(0);
		
	}
	
	public void trickleDown(int index) {
		int largeChild;
		int leftChild;
		int rightChild;
		Link top = new Link(index);
		while (index <= currIndex/2) {
			leftChild = index*2+1;
			rightChild = index*2+2;
			if (rightChild<currIndex && 
					linkArray[leftChild].getData()>linkArray[rightChild].getData()) {
				largeChild = leftChild;
			}
			else {
				largeChild = rightChild;
			}
			
			if (top.getData() > linkArray[largeChild].getData()) {
				break;
			}
			linkArray[index] = linkArray[largeChild];
			index = largeChild;
		}
		linkArray[index] = top;
	}
	
	public void disp() {
		for (int i = 0; i < currIndex; i++) {
			System.out.print(linkArray[i].getData()+"->");
		}
		System.out.println();
	}
	
}