package Basic_problem;

import java.util.Scanner;

public class Emirp_number {
	
	public static boolean isPrimeNumber(int a) {
		int count=0;
			for(int i=1;i<a;i++) {
				if(a%i==0) {
					count++;
				}
			}
			if(count==1) {
				return true;
			}
			else {
				return false;
			}
		
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		System.out.println(isPrimeNumber(num));
		int r=0;
		int temp=num;
		
		while(num!=0) {
			r*=10;
			r+=num%10;
			num=num/10;
		}
		System.out.println(isPrimeNumber(r));
		if(isPrimeNumber(temp) && isPrimeNumber(r)) {
			System.out.println("Emir Number");
		}
		else {
			System.out.println("Not a Emir Number");
		}
		

	}

}
