package allprograms;

public class _12_FactorsOfaNumber {
	static int count = 0;
	static int factor(int n) {
		for (int i = 1; i <= n; i++)
			if (n % i == 0) {
				count++;
				System.out.println(i);
			}
		return count;
	}
	public static void main(String[] args) {
		System.out.println("Number of factors of a Number:" + factor(36));
	}
}
