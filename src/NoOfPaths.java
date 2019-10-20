import java.util.Scanner;

public class NoOfPaths {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int row = sc.nextInt();
			int column = sc.nextInt();
			int paths = noOfPaths(row, column);
			System.out.println(paths);
		}

	}

	private static int noOfPaths(int row, int column) {
		if (row == 1 && column == 1) {
			return 0;

		}

		if (row == 1 || column == 1) {
			return 1;
		}
		return noOfPaths(row - 1, column) + noOfPaths(row, column - 1);
	}

}
