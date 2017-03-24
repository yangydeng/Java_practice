
public class stackX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];  //after initialize, every element will be 0;
		stack s1 = new stack(arr);
		queue q1 = new queue(arr);
		q1.push(10);
		q1.push(22);
		q1.disp();
		q1.pop();
		q1.pop();
		q1.pop();

		
	}

}

class stack{
	private int index=0;
	private int[] array;
	public stack(int[] arr) {
		array = arr;
	}
	
	public void push(int a) {
		if(isFull())
			return;
		array[index] = a;
		index++;
	}
	
	public void pop() {
		if(isEmpyt())
			return;
		int a = array[index-1];
		index--;
		System.out.println(a);
	}
	
	public boolean isEmpyt() {
		if(index==0){
			System.out.println("Empty!");
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(index==array.length){
			System.out.println("Full");
			return true;	
		}			
		else {
			return false;
		}
	}
	
	public void disp() {
		for (int i = 0; i < index; i++) {
			System.out.println(array[i]);
		}
	}	
}

class queue{
	private int index=0;
	private int[] array;
	
	public queue(int[] arr) {
		array =arr;
	}
	
	public void push(int a) {
		if(isFull())
			return;
		array[index] = a;
		index++;
	}
	
	public void pop() {
		if (isEmpyt()) {
			return;
		}
		int a = array[0];
		System.out.println(a);
		for (int i = 0; i<index; i++) {
			array[i] = array[i+1];
		}
		index--;
		
	}
	
	public boolean isEmpyt() {
		if(index==0){
			System.out.println("Empty!");
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(index==array.length){
			System.out.println("Full");
			return true;	
		}			
		else {
			return false;
		}
	}
	
	public void disp() {
		for (int i = 0; i < index; i++) {
			System.out.println(array[i]);
		}
	}	
}







