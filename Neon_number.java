package Basic_problem;

import java.util.Scanner;

public class Neon_number {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = sc.nextInt();
		
		int square = num * num;
		int split =0;
		int sum=0;
		
		while(square!=0) {
			split = square%10;
			sum = sum +split;
			square = square/10;
		}
		if(sum == num) {
			System.out.println("Neon number");
		}
		else {
			System.out.println("Not a Neon number");
		}

	}

}
