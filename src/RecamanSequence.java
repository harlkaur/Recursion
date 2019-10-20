import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RecamanSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int no = sc.nextInt();
			int[] arr = new int[no];
			LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
			LinkedHashSet<Integer> result = recamanSeq(no, arr, set);
			Iterator<Integer> iter = result.iterator();
			while (iter.hasNext()) {
				System.out.print(iter.next() + " ");
			}
			System.out.println();
		}
	}

	private static LinkedHashSet<Integer> recamanSeq(int no, int[] arr, LinkedHashSet<Integer> set) {
		set.add(0);
		for (int i = 1; i < no; i++) {
			arr[i] = arr[i - 1] - i;
			if (arr[i] > 0 && !set.contains(arr[i])) {
				set.add(arr[i]);
			} else {
				arr[i] = arr[i - 1] + i;
				set.add(arr[i]);
			}
		}
		return set;
	}
}
