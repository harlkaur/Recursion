import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int no = sc.nextInt();
			int finalNum = no;
			boolean flag = true;
			System.out.print(no + " ");
			printPattern(no, finalNum, flag);
			System.out.println(" ");
		}
	}

	private static void printPattern(int num, int finalNum, boolean flag) {
		if (!flag && num == finalNum)
			return;
		if (flag) {
			if (num > 0) {
				num = (num - 5);
				System.out.print(num + " ");
				printPattern(num, finalNum, true);
			} else {
				num = (num + 5);
				System.out.print(num + " ");
				printPattern(num, finalNum, false);
			}
		} else {
			num = (num + 5);
			System.out.print(num + " ");
			printPattern(num, finalNum, false);
		}
	}

}
