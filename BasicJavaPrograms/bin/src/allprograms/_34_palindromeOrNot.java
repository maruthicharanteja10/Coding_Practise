package allprograms;

public class _34_palindromeOrNot {

	public static void main(String[] args) {
		int n = 343, n1 = n, rem = 0, rev = 0;
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.println(rev == n1 ? "Palindrome" : "Not a palindrome");

	}

}
