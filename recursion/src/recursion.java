import java.util.Scanner;
public class recursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		Scanner input = new Scanner(System.in);
		
		System.out.println("triangel:"+triangel(input.nextInt()));
		System.out.println("factorial:"+factorial(input.nextInt()));
		

	}

	public static int triangel(int n) {
		if(n==1){
			return 1;
		}
		else {
			return (n+triangel(n-1));
		}
		
	}
	
	public static int factorial(int n) {
		if(n==1)
			return 1;
		else {
			return(n*factorial(n-1));
		}
	}
}
