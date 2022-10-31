package payment;

import java.util.Scanner;

public class QuarterlyFees {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter your standard:");
		int std= sc.nextInt();
		
		if(std>0 && std<=1) {
			System.out.println("Quarterly fees for 1st standard student is 5000");
		}
		else if( std>1 && std<=2) {
			System.out.println("Quarterly fees for 2nd standard student is 10000");
		}
		else {
			if(std==3) {
				System.out.println("Quarterly fees for 3rd standard student is 15000");
				
			}
		
		}
		
	}

}
