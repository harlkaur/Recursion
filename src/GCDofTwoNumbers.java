import java.util.HashSet;
import java.util.Iterator;

public class GCDofTwoNumbers {

	public static void main(String[] args) {
		int a = 98;
		int b = 56;
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		int[] arr1= new int[500];
		int[] arr2 = new int[500];
		int k=0;
		int m=0;
		
		for(int i=2;i<a/2;i++) {
			if(a%i==0) {
				set.add(i);
				arr1[k++] = i;
			}
		}
		
		for(int i=2;i<b/2;i++) {
			if(b%i==0) {
				set2.add(i);
				arr2[m++] = i;
			}
		}
		
		if(arr1[arr1.length-1] == arr2[arr2.length-1])
		System.out.println(" gcd is : " + arr1[arr1.length-1]);
		
//		
//		Iterator<Integer> iter1 = set.iterator();
//		while(iter1.hasNext()) {
//			System.out.print(iter1.next() + " ");
//		}
//		System.out.println();
//
//		Iterator<Integer> iter2 = set2.iterator();
//		while(iter2.hasNext()) {
//			System.out.print(iter2.next() + " ");
//		}
//		
//		// print common elements of both the sets
//		if(set.contains(set2)) {
//			System.out.println(" if set inside set2 ");
//			Iterator<Integer> ite = set.iterator();
//			while(ite.hasNext()) {
//				System.out.print(ite.next() + " ");
//			}
//		}else if(set2.contains(set)) {
//			System.out.println(" if set2 inside set ");
//			while(iter2.hasNext()) {
//				System.out.print(iter2.next() + " ");
//			}
//		}
		
	}

}
