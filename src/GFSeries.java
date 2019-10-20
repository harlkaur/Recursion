import java.util.Scanner;

public class GFSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int no = sc.nextInt();
			for (int i = 1; i <= no; i++) {
				System.out.print(Math.round(gfSeries(i)) + " ");
			}
			System.out.println();
		}
	}

	private static double gfSeries(int no) {
		double result;
		if (no == 1) {
			return 0;
		} else if (no == 2) {
			return 1;
		} else {
			result = Math.pow(gfSeries(no - 2), 2) - gfSeries(no - 1);
		}
		return result;
	}

}
