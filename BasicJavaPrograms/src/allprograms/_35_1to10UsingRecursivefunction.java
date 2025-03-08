package allprograms;

public class _35_1to10UsingRecursivefunction {
	static void rec(int n) {
		if (n!=0) {
			rec(n-1);
			System.out.println(n);	
		}
	}
	public static void main(String[] args) {
		rec(10);
	}
}
