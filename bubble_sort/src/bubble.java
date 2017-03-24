
public class bubble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {23,54,65,72,56,8,35,2365,7};
		bubble_sort b1 = new bubble_sort(arr);
		b1.sort();
		b1.disp();
	}

}

class bubble_sort{
	private int[] array;
	public bubble_sort(int[] arr) {
		array = arr;
	}
	
	public int[] sort() {
		for(int j=0; j<array.length;j++)
		{
			for (int i = 0; i < (array.length)-1; i++) {
				if(array[i]>array[i+1])
				{
					int tmp;
					tmp = array[i];
					array[i] = array[i+1];
					array[i+1] = tmp;
				}
			}			
		}
		return array;
	}
	
	public void disp() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}