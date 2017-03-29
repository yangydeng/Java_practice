
public class QS_practice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {53,4,5,67,80,23,7,12,1,9};
		qs_practic qs = new qs_practic(arr);
		qs.disp();
		qs.recQS(0, arr.length-1);
		//qs.disp();

	}

	
}


class qs_practic{
	int[] array;
	int index;
	
	public qs_practic(int[] arr) {
		array = arr;
	}
	
	public int Pivot(int left,int right,int pivot) { 
		int ptrLeft = left-1;
		int ptrRight = right+1;
		
		while (true) {
			
			while(ptrLeft<right && array[++ptrLeft]<pivot);  // to find the position of the smaller value;
			while(ptrRight>left && array[--ptrRight]>pivot); //to find the position of the bigger value;
			if (ptrLeft>=ptrRight) {
				break;
			}
			else {
				
				swap(ptrLeft,ptrRight);
				
			}
		}
		return ptrLeft;
	}
	
	public void swap(int ptrLeft,int ptrRight) {
		int tmp = array[ptrLeft];
		array[ptrLeft] = array[ptrRight];
		array[ptrRight] = tmp;
	}
	
	public void recQS(int left,int right) {
		if (left>=right) {
			return;
		}
		else {
			int pivot = array[right];
			int ptr = Pivot(left,right,pivot);
			System.out.println("index: "+ptr+" pivot:"+pivot);
			disp();
			recQS(left, ptr-1);
			recQS(ptr, right);
		}
	}
	
	public void disp() {
		int len = array.length;
		System.out.print("arr: ");
		for(int i=0;i<len;i++){
			System.out.print(array[i]+",");			
		}
		System.out.println();
	}
}
