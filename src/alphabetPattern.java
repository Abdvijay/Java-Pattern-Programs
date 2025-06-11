/*
 A
 AB
 ABC
 */
import java.util.Scanner;

public class alphabetPattern {

	public static void main(String[] args) {
		int rows;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number : ");
		rows = in.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (char ch = 'A'; ch < 'A' + i; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
