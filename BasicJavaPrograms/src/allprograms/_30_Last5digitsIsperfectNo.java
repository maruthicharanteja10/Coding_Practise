package allprograms;

public class _30_Last5digitsIsperfectNo {
	private static boolean isPerfect(int n) {
		for (int i = 0; i <= n; i++) {
			if (n == i * i) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int num = 234314364, rem = 0, sum = 0;
		for (int i = 1; i <= 5; i++) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println(isPerfect(sum) ? "perfectno" : "Not a perfect no");
	}
}
