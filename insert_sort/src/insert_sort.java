
public class insert_sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,6,5,4,3,2,1};//{23,54,65,72,56,8,35,2365,7};
		inset i1 = new inset(arr);
		i1.sort();
		i1.disp();

	}

}

class inset{
	private int[] array;
	private int value;
	public inset(int[] arr) {
		array = arr;
	}
	
	public void sort() {		
		for (int index = 0; index < (array.length)-1; index++) {
			
			value = array[index+1];
			for (int i = index; i>=0; i--) {
				
				if(array[i]>value){
					array[i+1] = array[i];
					if(i==0){
						array[i] = value;
					}
					
				}
				else {
					array[i+1] = value;
					break;
				}
				
			}			
		}
		
	}
	
	public void disp() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}