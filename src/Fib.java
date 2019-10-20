
public class Fib {

	public static void main(String[] args) {
		int n = 20;
		long res = fib(n);
		System.out.println(res);
	}

	private static long fib(int n) {
		if (n <= 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}
}
