import java.util.Scanner;

public class CrossPattern {
    public static void main(String[] args) {
    	int rows;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the row value : ");
		rows = input.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == j || i + j == rows + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}