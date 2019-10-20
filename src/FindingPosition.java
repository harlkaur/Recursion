import java.util.Scanner;

public class FindingPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int result = findingPos(n);
			System.out.println(result);
		}
	}

	// TODO: use long in place of int
	private static int findingPos(int n) {
		int temp = 1;
		for (int i = 1; i <= n;) {
			if (i == n)
				return i;
			temp = i * 2;
			if (temp > n)
				return i;
			i = temp;
		}
		return temp;
	}
}
