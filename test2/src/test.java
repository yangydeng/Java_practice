public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("run the process...remember to learn how to write funtion");
		int[] arr = {0,1,2,3,4,5,6};
		find f = new find(arr);
		int num =1;
		int key = aaa(arr,num);
		System.out.println(key);
		
	}
	
	public static int aaa(int[] arr,int num) {  // inside the static function (main), we must use the static functions
		int key; //key is the position of num
		int low_bound = 0;
		int up_bound = arr.length-1;
		while(true){
			key = (low_bound + up_bound)/2;
			
			if(num > arr[key])
			{
				low_bound = key+1;
			}
			else if(num < arr[key]) 
			{
				up_bound = key-1;
			}
			else if(num == arr[key])
			{
				break;
			}
			if(low_bound>up_bound)
			{
				key = -1;
				break;
			}
		}
		
		return key;
	}


}

class find{
	private  int[] arr;
	
	public find(int [] array) {
		arr = array;
	}
	
	public int find_key(int num) { //num is the element we want to find
		int key; //key is the position of num
		int low_bound = 0;
		int up_bound = arr.length-1;
		while(true){
			key = (low_bound + up_bound)/2;
			
			if(num > arr[key])
			{
				low_bound = key+1;
			}
			else if(num < arr[key]) 
			{
				up_bound = key-1;
			}
			else if(num == arr[key])
			{
				break;
			}
			if(low_bound>up_bound)
			{
				key = -1;
				break;
			}
		}
		
		return key;
	}	
	
}