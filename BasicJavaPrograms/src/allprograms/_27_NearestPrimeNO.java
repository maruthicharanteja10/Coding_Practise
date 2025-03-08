package allprograms;

public class _27_NearestPrimeNO {
	public static boolean isprime(int n) {
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count == 2 ? true : false;
	}
	public static void main(String[] args) {
		int input = 8, count_front = 0, count_back = 0;
		for (int i = input;; i++) {
			if (isprime(i)) {
				break;
			}
			count_front++;
		}
		for (int i = input; i >= 2; i--) {
			if (isprime(i)) {
				break;
			}
			count_back++;
		}
		if (count_front - count_back == 0) {
			System.out.println((input + count_front) + " " + "difference :" + count_front);
		} else if (count_front < count_back) {
			System.out.println((input + count_front) + " " + "difference :" + count_front);
		} else {
			System.out.println((input + count_back) + " " + "difference :" + count_back);
		}
	}
}
