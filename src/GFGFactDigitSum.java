import java.util.Scanner;

public class GFGFactDigitSum {

    static int fact [] = new int [] {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			for (int i = 1; i < x; i++) {
				// pass single digit to the function

				int result = 0 , temp = i;
				while (temp != 0) {
					int digit = temp % 10;
					result = result + fact[digit];
					temp = temp / 10;
				}
				if (result == x) {
					System.out.println(i);
					return;
				}

			}
			System.out.println("-1");
		}
	}

}
