package array;

public class SumOfAllElements {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		int ans = sumAllElemets(arr,arr.length-1);
		System.out.println(ans);
	}

	private static int sumAllElemets(int[] arr, int n) {
		if(n <= 0) {
			return arr[n];
		}
		
		return sumAllElemets(arr, n-1)+arr[n];
	}

}
