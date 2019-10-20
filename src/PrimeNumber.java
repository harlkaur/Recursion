import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int no = sc.nextInt();
			boolean flag = primeNumber(no);
			if(flag)
			System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

	private static boolean primeNumber(int no) {
		boolean flag=true;
		if(no%2==0) {
			return flag=false;
		}
		for(int i=2;i<no/2;i++) {
			if(no %i==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}

}
