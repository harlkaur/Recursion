import java.util.Scanner;

public class GCDUsingrecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = gcd(a, b);
			System.out.println(result);
		}
	}

	private static int gcd(int a, int b) {
		if (a == 0)
			return b;
		else if (b == 0)
			return a;
		else if (a == b)
			return a;
		else if (a > b)
			return gcd(a - b, b);
		else
			return gcd(a, b - a);
	}

}
