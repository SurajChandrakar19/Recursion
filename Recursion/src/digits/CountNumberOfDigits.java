package digits;

public class CountNumberOfDigits {
	public static void main(String[] args) {
		int n = 12345;
		int digit = countDigits(n);
		System.out.println(digit);
	}

	private static int countDigits(int n) {
		if(n == 0) {
			return 0; 
		}
		
		return countDigits(n/10)+1;
	}
}
