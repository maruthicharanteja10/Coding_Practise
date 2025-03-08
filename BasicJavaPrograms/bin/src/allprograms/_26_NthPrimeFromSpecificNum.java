package allprograms;

public class _26_NthPrimeFromSpecificNum {
	public static boolean Nprime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count == 2 ? true : false;
	}

	public static void main(String[] args) {
		int input = 5, start = 12, count = 0;
		for (int i = start;; i++) {
			if (Nprime(i)) {
				count++;
			}
			if (count == input) {
				System.out.println(i);
				break;
			}
		}
	}
}
