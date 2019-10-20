
public class Digital {

	public static void main(String[] args) {
		int n = 99999;
		int res = digital(n);
	}

	private static int digital(int n) {
		if (n < 10)
			return n;
		else {
			int k = digitalUtil(n);
			return digital(k);
		}
	}

	private static int digitalUtil(int n) {
		if (n < 10) {
			return n;
		}
		return digitalUtil(n / 10) + n % 10;
	}

}
