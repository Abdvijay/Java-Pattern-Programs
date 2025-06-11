import java.util.Scanner;

public class floydTriangle {

	public static void main(String[] args) {
		int rows, num = 1;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number : ");
		rows = in.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println("\n");
		}
	}

}
