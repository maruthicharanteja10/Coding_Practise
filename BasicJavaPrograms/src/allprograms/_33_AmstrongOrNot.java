package allprograms;

public class _33_AmstrongOrNot {
	public static int power(int base, int exp) {
		int p = 1;
		for (int i = 1; i <= exp; i++) {
			p = p * base;
		}
		return p;
	}
	public static void main(String[] args) {
		int n = 153, n1 = n, n2 = n, count = 0, rem = 0, sum = 0;
		while (n != 0) {
			count++;
			n = n / 10;
		}
		while (n1 != 0) {
			rem = n1 % 10;
			sum = sum + power(rem, count);
			n1 = n1 / 10;
		}
		System.out.println(sum == n2 ? "Amstrong Number" : "Not a Amstrong Number");
	}
}
