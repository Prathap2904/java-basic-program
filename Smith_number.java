package Basic_problem;

public class Smith_number {

	public static void main(String[] args) {
		int n=85;
		int i=0;
		String primenumber =" ";
		
		for(i=1;i<=n;i++) {
			
			int count=0;
			for(n=i;n>=1;n--) {
				if(i%n==0) {
					count++;
				}
			}
			if(count%2==0)
				primenumber = primenumber+i+"";
		}
		System.out.println(primenumber);
	}

}
