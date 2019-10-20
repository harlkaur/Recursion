import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long no = sc.nextLong();
			long result = factorial(no);
			System.out.println(result);
		}

	}

	private static long factorial(long no) {
		if (no > 0) {
			if (no == 1) {
				return 1;
			} else {
				return no * factorial(no - 1);
			}
		} else
			return -1;
	}

}
