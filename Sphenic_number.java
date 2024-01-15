package Basic_problem;

import java.util.Scanner;

public class Sphenic_number {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		
		int count=0;
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
				if(count==2) {
					System.out.println(i);
				}
			}
		}

	}

}
