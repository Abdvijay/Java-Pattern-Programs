import java.util.Scanner;

public class printNumberIncreasingOrder {

	public static void main(String[] args) {
		int number;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number : ");
		number = in.nextInt();
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("\n");
		}
	}

}
