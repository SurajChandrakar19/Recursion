package digits;

public class SumAllDigits {
	public static void main(String[] args) {
		int n = 12345;
		int total = sumAllDigits(n);
		System.out.println(total);
	}

	private static int sumAllDigits(int n) {
		if(n == 0) {
			return 0;
		}

		return sumAllDigits(n/10) + (n%10);
	}
}
