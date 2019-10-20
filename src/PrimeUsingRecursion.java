import java.util.Scanner;

public class PrimeUsingRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int no = sc.nextInt();
			int i = 2;
			String result = primeNumber(no, i);
			System.out.println(result);
		}

	}

	private static String primeNumber(int no, int i) {
		String flag = "Yes";
		if (no % 2 == 0) {
			 flag = "No";
			 return flag;
		} else if (no % i == 0) {
			flag = "No";
			return flag;
		} else if(i > no/2) {
			flag  = "Yes";
			return flag;
		} else {
			return primeNumber(no, i + 1);
		}
	}

}
