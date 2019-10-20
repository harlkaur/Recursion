
public class FindPos {

	public static void main(String[] args) {
		int no = 13;
		int result = findPos(no);
		System.out.println(result);
	}

	private static int findPos(int no) {
		int temp = 1;
		for (int i = 1; i <= no;) {
			if (i == no) {
				return i;
			}
			temp = i * 2;
			if (temp > no) {
				return i;
			}
			i = temp;
		}
		return temp;

	}

}
