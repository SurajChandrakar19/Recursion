package string;

public class ReversString {
	public static void main(String[] args) {
		String str = "suraj";
		
		String ans = reversString(str);
		System.out.println(ans);
		
		ans = reversString(str, str.length()-1);
		System.out.println(ans);
		
		ans = reversString(str, "", str.length()-1);
		System.out.println(ans);
	}
	
	static public String reversString(String str) {
		if(str.length() == 1) {
			return str;
		}
		
		return str.charAt(str.length()-1)+reversString(str.substring(0, str.length()-1));
	}
	
	static public String reversString(String str, int index) {
		if(index == 0) {
			return ""+str.charAt(index);
		}
		
		return str.charAt(index)+reversString(str, --index);
	}
	
	static public String reversString(String str, String ans, int index) {
		if(index < 0) {
			return ans;
		}
		
		return reversString(str,ans+str.charAt(index), --index);
	}
}
