import java.util.Scanner;

public class hollowRectangle {

	public static void main(String[] args) {
		int rows, columns;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the row value : ");
		rows = input.nextInt();
		System.out.print("Enter the column value : ");
		columns = input.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				if (i == 1 || i == rows || j == 1 || j == columns) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
