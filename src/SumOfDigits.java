
public class SumOfDigits {

	public static void main(String[] args) {
		int n = 99;
		int i = sumOfDigits(n);
		System.out.println(i);
	}

	public static int sumOfDigits(int n) {
		if (n < 10) {
			return n;
		}else
		return sumOfDigits(n/10) + n % 10;
	}
}
