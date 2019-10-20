import java.util.Scanner;

public class ReverseDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long no = sc.nextLong();
			long reverse = reverseDigits(no);
			System.out.println(reverse);
		}
	}

	private static long reverseDigits(long no) {
		long reverse = 0;
		while (no != 0) {
			long digit = no % 10;
			reverse = reverse * 10 + digit;
			no = no / 10;
		}
		return reverse;
	}

}
