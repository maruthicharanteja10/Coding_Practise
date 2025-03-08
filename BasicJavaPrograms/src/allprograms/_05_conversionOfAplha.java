package allprograms;

public class _05_conversionOfAplha {
	public static void main(String[] args) {
		// a-z to A-Z
		char c1 = (char) ('a' - 32);
		char c2 = (char) ('z' - 32);
		System.out.println(c1 + " " + c2);
		// A_Z to a-z
		char c3 = (char) ('A' + 32);
		char c4 = (char) ('Z' + 32);
		System.out.println(c3 + " " + c4);
	}
}
