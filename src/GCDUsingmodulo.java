
public class GCDUsingmodulo {

	public static void main(String[] args) {
		int a = 98;
		int b = 56;
		int result = gcd(a, b);
		System.out.println(result);
	}

	private static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

}
