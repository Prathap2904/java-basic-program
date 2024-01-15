package Basic_problem;

public class Copyarr1to_arr2 {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		
		int arr2[]=new int[arr1.length];
		
		System.out.println("Elements of copied array:");
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
			System.out.print(arr2[i]+" ");
		}
		System.out.print(" ");


	}

}
