package Basic_problem;
import java.util.*;

public class Fibonaci {

	public static void main(String[] args) {
		int n=10;
		int r1=0;
		int r2=1;
		int r3;
		System.out.print(r1+" "+r2+" ");
		
		for(int i=2;i<n;++i) {
			r3 =r1+r2;
			System.out.print(r3+" ");
			r1=r2;
			r2=r3;
		}
		
		
		

	}

}
