package Basic_problem;

import java.util.Scanner;

public class Automorpic_number {
	

	public static void main(String[] args) {
		int num;
		int flag=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num=sc.nextInt();
		
		int square = num*num;
		
		while(num>0) {
			if(num%10!= square%10) {
				flag=0;
				System.out.println("Not a Automorphic Number");
				break;
			}
			num=num/10;
			square=square/10;
		}
		if(flag==1) {
			System.out.println("Automorphic Number");
		}

	}

}
