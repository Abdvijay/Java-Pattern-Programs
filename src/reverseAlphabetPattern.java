/*
 ABCD
 ABC
 AB
 A 
 */
import java.util.Scanner;

public class reverseAlphabetPattern {

	public static void main(String[] args) {
		int rows;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number : ");
		rows = in.nextInt();
		for (int i = rows; i >= 1; i--) {
			for (char ch = 'A'; ch < 'A' + i; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
