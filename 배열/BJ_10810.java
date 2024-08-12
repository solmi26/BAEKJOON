package backjoon;

import java.util.Scanner;

public class BJ_10810 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[sc.nextInt()];
		
		for(int i=0; i<sc.nextInt(); i++) {
			String str = sc.nextLine();
			int a = str.charAt(0);
			int b = str.charAt(2); 
			int c = str.charAt(4);
			
			System.out.println(a + " " + b + " " + c);
			
			for(int j=a; j<=b; j++) {
				arr[j] = c;
			}
		}
		
		for(int a : arr) {
			System.out.print(a + " ");
		}
		
	}

}
