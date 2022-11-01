import java.util.Scanner;

public class Child {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter your age:");
		
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();
		
		if(age <=7) {
			System.out.println("First class students");
		}else if(age <=8) {
			System.out.println("Second class students");
		}else if(age <=9) {
			System.out.println("Third class students");
		}else {
			System.out.println("Other class students");
		}
	
	}
	

}
