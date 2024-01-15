package Basic_problem;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		
		int pin =1234;
		int bankbalance = 20000;
		int deposit =0;
		int withdraw =0;
		String name;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Pin:");
		pin=sc.nextInt();
		
		if(pin==1234) {
			
			System.out.println("Enter your Name:");
			name=sc.next();
			System.out.println("Welcome "+name);
			while(true) {
				System.out.println("Enter 1 to checkbalance:");
				System.out.println("Enter 2 to deposit:");
				System.out.println("Enter 3 to withdraw:");
				System.out.println("Enter 4 to recipit");
				System.out.println("Enter 5 to exit");
				
				int option=sc.nextInt();
				
				switch(option){
					case 1:
						System.out.println("Your BankBalance is:"+bankbalance);
						break;
					case 2:
						System.out.println("Enter Amount to Deposit:");
						deposit = sc.nextInt();
						bankbalance = bankbalance+deposit;
						break;
					case 3:
						System.out.println("Enter Amount to Withdraw:");
						withdraw = sc.nextInt();
						if(withdraw > bankbalance) {
							System.out.println("Insufficient balance");
							System.out.println("Enter correct amount to withdraw:");
						}
						else {
							bankbalance = bankbalance - withdraw;
						}
						break;
					case 4:
						System.out.println("Bankbalance :"+bankbalance);
						System.out.println("withdraw :"+withdraw);
						System.out.println("deposit :"+deposit);
						break;
				
				 default:
					 System.out.println("Press The number below 5");
					 break;
				}
				if(option==5) {
					System.out.println("Thank you"+name);
				}
			}
		}
		
		
		
		
		

	}

}
