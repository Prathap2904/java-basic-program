package Basic_problem;

import java.util.Scanner;
import java.util.*;

public class SunnyNumber {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num=sc.nextInt();
		
		int square=num+1;
		
		int power = (int)Math.sqrt(square);
		if(square==power*power) {
			System.out.println("Sunny NUmber");
		}
		else {
			System.out.println("Not a Sunny Number");
		}

	}

}
