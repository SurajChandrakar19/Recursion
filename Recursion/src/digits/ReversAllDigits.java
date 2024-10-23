package digits;

public class ReversAllDigits {

	public static void main(String[] args) {
		int n = 12345;
		String revers = reversAllDigits(n);
		System.out.println(revers);

	}

	private static String reversAllDigits(int n) {
		if(n == 0) {
			return ""; 
		}
		return n%10+reversAllDigits(n/10);
	}

}
