import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int no = sc.nextInt();
			for (int i = no + 1; i < 1000; i++) {
				HashSet<Integer> set = new HashSet<Integer>();
				boolean result = nextHppyNumber(i, set);
				if (result) {
					System.out.println(i);
					break;
				}
			}
		}
	}

	private static boolean nextHppyNumber(int no, HashSet<Integer> set) {

		int sum = calculateSum(no);
		if (sum == 1) {
			return true;
		} else if (set.contains(no)) {
			return false;
		} else {
			set.add(no);
		}
		return nextHppyNumber(sum, set);
	}

	private static int calculateSum(int no) {
		int sum = 0;
		while (no > 0) {
			int digit = no % 10;
			sum += digit * digit;
			no = no / 10;
		}
		return sum;
	}

}
