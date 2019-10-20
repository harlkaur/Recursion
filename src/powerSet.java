import java.util.ArrayList;
import java.util.Collections;

public class powerSet {

	public static void main(String[] args) {
		String s = "abc";
		ArrayList<String> res = powerSet(s);
		Collections.sort(res);
		for (String ss : res)
			System.out.println(ss + " ");
		System.out.println();
	}

	static ArrayList<String> powerSet(String s) {
		String curr = "";
		int index = 0;
		 ArrayList<String> list = new ArrayList<String>();
		powerSetUtil(s, curr, index,list);
		return list;
	}

	private static void powerSetUtil(String s, String curr, int index,  ArrayList<String> list) {
		if (index == s.length()) {
			//System.out.println(curr + " ");
			list.add(curr);
			return;
		}
		powerSetUtil(s, curr, index + 1,list);
		powerSetUtil(s, curr + s.charAt(index), index + 1,list);
	}
}
