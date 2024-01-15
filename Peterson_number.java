package Basic_problem;

import java.util.Scanner;

public class Peterson_number {

	public static void main(String[] args) {
		int num;
		int digit=0;
		int fact=1;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		int temp=num;
		
		while(temp>0) {
			digit = temp%10;
			for(int i=1;i<=digit;i++) {
				fact=fact*i;
			}
			
			sum=sum+fact;
			fact=1;
			temp=temp/10;
		}
		
		temp=num;
		if(temp==sum) {
			System.out.println("It is a Peterson number");
		}
		else {
			System.out.println("It is not a Peterson Number");
		}
		

	}

}
