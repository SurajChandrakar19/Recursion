package search;

import java.util.Scanner;

public class BinaySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("please enter length = ");
		int[] arr = new int[sc.nextInt()];
		
		System.out.println("you can enter elements ");
		takeInput(arr, sc);
		
		System.out.print("Enter Key = ");
		int key = sc.nextInt();
		
		int index = findByBinarySearch(arr, key);
		System.out.println("In this index your key is present => " + index);
	}

	private static int findByBinarySearch(int[] arr, int key) {
		
		int l = 0, h = arr.length-1;
		int mid = 0;
		
		while(l <= h) {
			mid = (h+l)/2;
			if(arr[mid] == key) {
				return mid; 
			}else if(arr[mid] < key) {
				l = mid+1;
			}else {
				h = mid-1;
			}
			
		}
		return -1;
	}

	private static void takeInput(int[] arr, Scanner sc) {
		int i = 0;
		while(i <= arr.length-1) {
			arr[i++] = sc.nextInt();
		}
		
	}

}
