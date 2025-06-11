/*
  
 *****
 *****
 *****

 */

import java.util.Scanner;

public class solidRectangle {

	public static void main(String[] args) {
		int m, n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the m value : ");
		m = input.nextInt();
		System.out.print("Enter the n value : ");
		n = input.nextInt();
		System.out.println("Pattern printing with " + m + " Row " + n + " Column \n");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}

}
