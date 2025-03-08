package allprograms;

public class _24_last4digitsPrimeOrNot {
	public static boolean isprime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= i / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int num = 3456788, rem = 0, sum = 0;
		for (int i = 1; i <= 4; i++) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println(isprime(num) ? "luckyno" : "Not a luckyno");
	}
}
