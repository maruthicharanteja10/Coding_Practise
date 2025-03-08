package allprograms;
public class _37_SumOfNaturalNoUsingRec {
	static int rec(int n) {
		if (n!=0) {	
			return n+rec(n-1);
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(rec(20));
	}
}
