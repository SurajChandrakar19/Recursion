package introduction;

public class FibonaSerice {
	public static void main(String[] args) {
		//what is fibonaci Serise
		//1 1 2 3 5 8 13 21 34 55 89
		//if you want to print all fibona seriece till n then use this one
		fibonaSerice(45,0,1);
		
		//if you want any term wise the you can use this one
		// 1 1 2 3 5 
//		System.out.println(fiboTerm(11));// output must 5
	}
	
	
	private static int fiboTerm(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		
		return fiboTerm(n-1) + fiboTerm(n-2);
	}


	public static void fibonaSerice(int n, int pri, int pre) {
		if(pre >= n) {
			return;
		}
		System.out.println(pri+pre);
		fibonaSerice(n, pre, pri+pre);		
	}
}
