package allprograms;

public class _06_evenOrnot {
	public static void main(String[] args) {
		// using modulo
		int num = 18;
		System.out.println(num % 2 == 0 ? "evenno" : "Not evenno");
		// divison
		System.out.println((num / 2) * 2 == num ? "evenno" : "Not evenno");
		// Bitwise AND
		System.out.println((num & 1) == 0 ? "evenno" : "Not evenno");
		// Using shift operator
		System.out.println((num >> 1) << 1 == num ? "evenno" : "Not evenno");
		// Using XOR operator
		System.out.println((num ^ 1) == num + 1 ? "evenno" : "Not evenno");
	}
}
