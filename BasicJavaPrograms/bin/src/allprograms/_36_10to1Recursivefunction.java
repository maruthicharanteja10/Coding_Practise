package allprograms;
public class _36_10to1Recursivefunction {
	static void rec(int n) {
		if (n!=0) {	
			System.out.println(n);	
			rec(n-1);
		}
	}
	public static void main(String[] args) {
		rec(10);
	}
}
