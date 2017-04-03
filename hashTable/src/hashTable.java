
public class hashTable {

	/**
	 * @param args
	 * This is the linear method to construct the hashtable;
	 */
	public static void main(String[] args) {
		// suppose we have an array with length 10;
		int[] arr = new int[10];
		Htable t1 = new Htable(arr);
		t1.disp();
		t1.insert(10);
		t1.insert(15);
		t1.insert(24234);
		t1.insert(435);
		t1.insert(9);
		t1.delete(24234);
		t1.disp();
		t1.find(9);
		t1.insert(10);
		t1.insert(15);
		t1.insert(24234);
		t1.insert(435);
		t1.insert(9);
	}

}


class Htable{
	public int[] array;
	public int left;
	public Htable(int[] arr) {
		array = arr;
		left = arr.length;         //before initialized, every element in array is 0;
	}
	
	public void insert(int value) {
		if (left==1) {
			System.out.println("The hash table is full!");
			return;
		}
		int index = value%10;
		while (array[index]!=0) {
			index++;    // to find the empty index for insert;
			index=index%10;  // to constrain the index inside the boundary;
		}
		
		array[index] = value;
		left--;
		
	}
	
	public void find(int value) {
		int index = value%10;
		while (array[index]!=0) {
			if (array[index] == value) {
				System.out.println(value+" found!");
				return;
			}
			index++;
			index=index%10;    // to constrain the index inside the boundary;
		}
		System.out.println(value+" not found!");
		return;
	}
	
	public void delete(int value) {
		int index = value%10;
		while (array[index]!=0) {
			if (array[index] == value) {
				array[index] = 0; // deleted
				System.out.println(value+" has been deleted!");
				return;
			}
			index++;
			index=index%10;
		}
		System.out.println(value+" not found!");
		return;
	}
	
	public void disp() {
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+",");
		}
		System.out.println();
	}
}