package allprograms;

public class _21_SpyNo {
	public static void main(String[] args) {
		int num = 123, rem = 0, sum = 0, product = 1;
		while (num != 0) {
			rem = num % 10;
			sum = sum + rem;
			product = product * rem;
			num = num / 10;
		}
		System.out.println((sum == product) ? "SpyNo" : "Not a spyno");
	}
}
