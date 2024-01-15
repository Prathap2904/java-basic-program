package Basic_problem;

import java.util.Scanner;

public class Fascinating_number {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		String checknum ="123456789";
		
		int mult2 = num*2;
		int mult3 = num*3;
		String a=Integer.toString(num);
		String b=Integer.toString(mult2);
		String c=Integer.toString(mult3);
		String f=5+"";
		String d= a+b+c;
		
		for(int i=0;i<checknum.length();i++) {
			if(!d.contains(checknum.charAt(i)+"")) {
				System.out.println(false);
				return;
			}
		}
		System.out.println(true);
	}



}
