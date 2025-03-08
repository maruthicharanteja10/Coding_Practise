package allprograms;

public class _29_StrongNumber {
	private static int factno(int n) {
		int fact = 1;
		while (n != 0) {
			fact = fact * n;
			n--;
		}
		return fact;
	}
	public static void main(String[] args) {
		int num = 145, num1 = 145, rem = 0, sum = 0;
		while (num != 0) {
			rem = num % 10;
			sum = sum + factno(rem);
			num = num / 10;
		}
		System.out.println(sum == num1 ? "Strong no" : "Not a Strong no");
	}
}
