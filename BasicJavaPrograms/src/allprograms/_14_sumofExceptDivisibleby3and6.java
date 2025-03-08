package allprograms;

public class _14_sumofExceptDivisibleby3and6 {
	 static int sum = 0;

		public static int div(int n) {

			for (int i = 0; i <= n; i++) {
				if (i % 3 == 0 && i % 6 == 0) {
					continue;
				}
				sum = sum + i;
			}
			return sum;
		}
	public static void main(String[] args) {
		System.out.println(div(10));
	}
}
