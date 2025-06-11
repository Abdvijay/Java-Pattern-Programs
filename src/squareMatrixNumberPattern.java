import java.util.Scanner;

public class squareMatrixNumberPattern {

	public static void main(String[] args) {
		int rows;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number : ");
		rows = in.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
