
/*
   A
  ABA
 ABCBA
  ABA
   A
 */
import java.util.Scanner;

public class diamondLetter {

	public static void main(String[] args) {
		int rows;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the row value : ");
		rows = input.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (char ch = 'A'; ch < 'A' + i; ch++) {
				System.out.print(ch);
			}
			for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
				System.out.print(ch);
			}
			System.out.println();
		}
		for (int i = rows - 1; i >= 1; i--) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (char ch = 'A'; ch < 'A' + i; ch++) {
				System.out.print(ch);
			}
			for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}