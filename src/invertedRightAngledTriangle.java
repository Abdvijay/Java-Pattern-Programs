/*
 
 ****
 ***
 **
 *

 */
import java.util.Scanner;

public class invertedRightAngledTriangle {

	public static void main(String[] args) {
		int m;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the m value : ");
		m = input.nextInt();
		for (int i = m; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}

}
