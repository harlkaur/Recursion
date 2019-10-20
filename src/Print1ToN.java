
public class Print1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void printNos(int N)
    {
		if(N< 1) {
			return;
		}
		printNos(N-1);
		System.out.print(N);
    }
}
