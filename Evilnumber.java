package Basic_problem;

import java.util.Scanner;


public class Evilnumber {
	
	public static boolean isEvil(int n) {
		int count =0;
		long binary = convertbinary(n);
		while(binary!=0) {
			
			if(binary%10==1) {
				count++;
			}
			binary=binary/10;
		}
		if(count%2==0) {
			return true;
		}
		return false;
	}
	
	public static long convertbinary(int n) {
		int rem =0;
		long binarynumber =0;
		int i=1;
		while(n!=0) {
			rem = n%2;
			binarynumber = binarynumber + rem*i;
			n=n/2;
			i=i*10;
		}
		return binarynumber;
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		n = sc.nextInt();
		
		if(isEvil(n)) {
			System.out.println("Evilnumber");
		}
		else {
			System.out.println("Not a EvilNumber");
		}

}
}
