
public class quickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayPar arr = new ArrayPar(10);
		arr.insert(10);
		arr.insert(3);
		arr.insert(13);
		arr.insert(22);
		arr.insert(44);
		arr.insert(1);
		arr.insert(5);
		arr.display();
		int pivot = 10;
		System.out.print("pivot is :"+pivot);
		int size = arr.size();
		
		arr.recQuickSort(0, size-1);
		arr.display();
		

		arr.display();
	}

}

class ArrayPar{
	private long[] theArray;
	private int index;
	
	public ArrayPar(int max) {
		theArray = new long[max];
		index = 0;
	}
	
	public void insert(long value) {
		theArray[index] = value;
		index++;
	}
	
	public int size() {
		return index;
	}
	
	public void display() {
		System.out.print("A=");
		for(int j=0; j<index; j++){
			System.out.print(theArray[j]+" ");
		}
		System.out.println("");
	}
	
	public int partitionIt(int left,int right,long pivot) {
		int leftPtr = left -1;
		int rightPtr = right +1;
		while (true) {
			while(leftPtr < right && theArray[++leftPtr]<pivot);
			while(rightPtr > left && theArray[--rightPtr]>pivot);
			if (leftPtr >= rightPtr) {
				break;
			} else {
				swap(leftPtr,rightPtr);
			}			
		}
		return leftPtr;
	}
	
	public void swap(int dex1,int dex2) {
		long temp;
		temp = theArray[dex1];
		theArray[dex1] = theArray[dex2];
		theArray[dex2] = temp;
	}
	
	public void recQuickSort(int left,int right) {
		if(right-left <= 0)
			return;
		else {
			long pivot = theArray[right];
			int partition = partitionIt(left, right, pivot);
			
			recQuickSort(left, partition-1);
			recQuickSort(partition+1, right);
		}
	}
}


