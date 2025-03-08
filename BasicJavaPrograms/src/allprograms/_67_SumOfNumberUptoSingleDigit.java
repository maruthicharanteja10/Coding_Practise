package allprograms;

public class _67_SumOfNumberUptoSingleDigit {
	public static void main(String[] args) {
		int num=145;
		int sum = 0;
		while (num > 0 || sum > 9) {
			if (num == 0) {
				num = sum;
				sum = 0;
			}
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println(sum);
	}
}
