package Basic_problem;

import java.util.Scanner;

public class Tech_number {

	public static void main(String[] args) {
		int num;
		int r=0;
		int digit=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		int temp=num;
		
		while(temp>0) {
			r=temp%10;
			digit++;
			temp=temp/10;
		}
		int sum=0;
		int square=0;
		if(digit%2==0) {
			int first=num%100;
			int second=num/100;
			 sum=first+second;
			 square=sum*sum;
			 if(num==square) {
				 System.out.println("Tech Number");
			 }
			 else {
				 System.out.println("Not a Tech Number");
			 }
			 
			
		}
		else {
			System.out.println("Not a Tech Number");
		}
		
		
		

	}

}
