package Basic_problem;
import java.util.ArrayList;
public class Keith_number {
	
	public static int adding(ArrayList<Integer>arr) {
		int sum=0;
		for(int i:arr) {
			sum=sum+i;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		int num =742;
		int sum=0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while(num!=0) {
			arr.add(0,num%10);
			System.out.println(arr);
			num = num/10;
		}
		adding(arr.add(sum));
		arr.remove(0);
		System.out.println(arr);

	}
	

}
