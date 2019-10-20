import java.util.Scanner;

public class FactDigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			for (int i = 1; i < x; i++) {
				// pass single digit to the function

				int result = 0;
				while (i != 0) {
					int digit = i % 10;
					result = result + factorial(digit);
					i = i / 10;
				}
				if (result == x) {
					System.out.println(i);
					break;
				}

			}
			System.out.println("-1");
		}
	}

	private static int factorial(int no) {
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
