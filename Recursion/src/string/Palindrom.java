package string;

public class Palindrom {

	public static void main(String[] args) {
		String s = "m";
		boolean ans = isPalindrom(s,0,s.length()-1);
		System.out.println(ans);
	}

	private static boolean isPalindrom(String s, int i, int j) {
		if(j <= i) {
			return true;
		}
		
		if(s.charAt(i) != s.charAt(j)) {
			return false;
		}
		return isPalindrom(s, i+1, j-1);
	}

}
