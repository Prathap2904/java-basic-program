package Basic_problem;

import java.util.Scanner;
class PrimeNumber100
{
   public static void main (String[] args)
   {		
      int num=0;
      int i=0;
      String primenumber ="";
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number: ");
      num = sc.nextInt();
      
      for(i=1;i<=num;i++) {
    	  int count=0;
    	  for(num=i;num>=1;num--) {
    		  if(i%num==0) {
    			  count++;
    		  }
    	  }
    	  if(count%2==0) {
    		  primenumber = primenumber +i+" ";
    	  }
      }
      System.out.println("PrimeNumber: "+primenumber);
   }
}