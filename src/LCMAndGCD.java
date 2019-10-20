import java.util.Scanner;

public class LCMAndGCD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long gcd = gcd(a,b);
			System.out.println(lcm(a, b,gcd) + " " + gcd);
		}
		
	}

	private static long lcm(long a, long b,long gcd) {
		long result;
		result = (a * b) / gcd;
		return result;
	}

	private static long gcd(long a, long b) {
		if (a == 0 || a==b)
			return b;
		if (b == 0)
			return a;
		if (a > b)
			return gcd(a - b, b);
		else
			return gcd(a, b - a);
	}

}
