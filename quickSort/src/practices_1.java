
public class practices_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {234,56,2,876,89,4,987,3,87};
		qs q1 = new qs(arr);
		q1.disp();
		q1.rec(0, arr.length-1);
		q1.disp();

	}

}

class qs{
	int[] array;
	
	public qs(int[] arr) {
		array = arr;
	}
	
	public int partiton(int left,int right) {
		int ptrLeft = left-1;
		int ptrRight = right+1;
		int pivot = array[right];
		while (true) {
			while(ptrLeft<right && array[++ptrLeft]<pivot);
			while(ptrRight>left && array[--ptrRight]>pivot);
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
	
	public void rec(int left,int right) {
		if (left>=right) {
			return;
		}
		else {
			int par = partiton(left, right);  // the array is sorted at this step;
			rec(left, par-1);
			rec(par, right);
		}
	}
	
	
	public void disp() {
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}

