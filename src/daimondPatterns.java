
/*
 
    *
   ***
  *****
   ***
    *
 
 */
import java.util.Scanner;

public class daimondPatterns {

	public static void main(String[] args) {
		int height;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the height of the daimond : ");
		height = in.nextInt();
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		for (int i = height - 1; i >= 1; i--) {
			for (int j = 1; j <= height - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}

}
