package Basic_problem;

import java.util.Scanner;

public class Duck_number {
	
	public static boolean isDucknumber(int a) {
		while(a!=0) {
			if(a%10==0) {
				return true;
			}
			a=a/10;
		}
		return false;
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		n = sc.nextInt();
		
		if(isDucknumber(n)) {
			System.out.println("Duck Number");
		}
		else {
			System.out.println("Not a Duck Number");
		}
	}

}
