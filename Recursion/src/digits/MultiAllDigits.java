package digits;

public class MultiAllDigits {

	public static void main(String[] args) {
		int n = 12345;
		int total = multiAllDigit(n);
		System.out.println(total);

	}

	private static int multiAllDigit(int n) {
		if(n == 1) {
			return 1;
		}
		
		return multiAllDigit(n/10)*(n%10);
	}

}
