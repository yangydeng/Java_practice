
public class selection_sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {23,54,65,72,56,8,35,65,2365,7,0};
		select s1 = new select(arr);
		s1.sort();
		s1.disp();
	}

}

class select{
	private int index=0;
	private int[] array;
	int min_value;
	public select(int[] arr) {
		array = arr;
	}
	
	public void sort() {
		
		for (int j = 0; j < array.length; j++) {
			min_value = array[j];
			for (int i = j; i < array.length; i++) {
				if(array[i]<min_value){
					min_value = array[i];
					index = i;
				}
			}
			int[] val = swap(array[j], min_value);
			array[j] = val[0];
			array[index] = val[1];
		}	
	}
	
	public void disp() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}	
	
	public int[] swap(int a,int b) {
		int tmp; 
		tmp = a;
		a = b;
		b = tmp;
		int TMP[] = {a,b}; 
		return TMP;
	}
}