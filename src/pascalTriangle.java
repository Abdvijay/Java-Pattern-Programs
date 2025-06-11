/*
    1 
   1 1 
  1 2 1 
 1 3 3 1 
 */
import java.util.Scanner;

public class pascalTriangle {

	public static void main(String[] args) {
		int rows;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number : ");
		rows = in.nextInt();
		for (int i = 0; i < rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			int num = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num = num * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}

}
