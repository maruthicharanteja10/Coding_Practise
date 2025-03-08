package allprograms;

public class _82_ConvertDecimalNoToBinaryFormat {
	public static void main(String[] args) {
		// using String
		int n = 7;
		String ans = "";
		int rem = 0;
		while (n != 0) {
			;
			rem = n % 2;
			ans = rem + ans;
			n = n / 2;
		}
//		System.out.println(ans);
		int bi = Integer.parseInt(ans);// converting string into int
		System.out.println(bi);
		// Using Integer
		int x = 13;
		int i = 0;
		int ans1 = 0;
		while (x != 0) {
			if (x % 2 == 1) {
				ans1 = (int) (Math.pow(10, i) + ans1);
			}
			x = x / 2;
			i++;
		}
		System.out.println(ans1);
	}
}
