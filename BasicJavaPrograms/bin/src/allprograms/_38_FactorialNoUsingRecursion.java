package allprograms;

public class _38_FactorialNoUsingRecursion {
	static int rec(int n) {
		if (n!=0) {	
			return n*rec(n-1);
		}
		return 1;
	}
	public static void main(String[] args) {
		System.out.println(rec(5));
	}
}
