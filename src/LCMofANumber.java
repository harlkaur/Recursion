import java.util.HashSet;
import java.util.Iterator;

public class LCMofANumber {

	public static void main(String[] args) {
		int a = 14;
		int b = 8;
		lcm(a, b);
	}

	private static void lcm(int a, int b) {
		int lcm = 1;
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				System.out.print(  i + " : ");
				set.add(i);
			}
		}
		for (int i = 2; i <= b / 2; i++) {
			if (b % i == 0) {
				System.out.print(  i + " : ");
				set.add(i);
			}
		}
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			int element = iter.next();
			lcm = lcm * element;
		}
		System.out.print(lcm + " ");
		// to find gcd
		
		
	}

}
