package Basic_problem;

import java.util.Scanner;

public class Buzz_number {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		
		if(num%10==7 || num%7==0) {
			System.out.println("Buzz Number");
		}
		else {
			System.out.println("Not a Buzz Number");
		}

	}

}
