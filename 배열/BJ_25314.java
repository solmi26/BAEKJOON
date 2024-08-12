package backjoon;

import java.util.Scanner;

public class BJ_25314 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = Integer.parseInt(sc.nextLine()) / 4;
		
		for(int i=0; i<count; i++) {
			System.out.print("long ");
		}
		System.out.print("int");
	}

}
