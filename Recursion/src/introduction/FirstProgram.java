package introduction;


//recursion in nothing but it calling it self
public class FirstProgram {
	public static void main(String[] args) {
		int n = 0;
		while(true) {
			System.out.println(n);
			n++;
		}
//		fun(1);
	}
	
	public static void fun(int n) {
		//base condition is mandatory
		if(n == 5000) {
			//don't use here break 
			return;
		}
		//printing n
		System.out.println(n);
		//calling recursion
		fun(n+1);
	}
}
