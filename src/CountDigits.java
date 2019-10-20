
public class CountDigits {

	public static void main(String[] args) {
		int n = 1111;
		int count = 0;
//		int result = countDigits(n, count);
		int result = countD(n);
		System.out.println(result);
	}

	private static int countD(int n) {
		if(n < 10) {
			return 1;
		}
		return countD(n/10)+1;
	}

	private static int countDigits(int n, int count) {
		if (n < 10) {
			return count + 1;
		}
		return countDigits(n / 10, count + 1);
	}
}
