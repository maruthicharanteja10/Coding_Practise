package allprograms;

public class _22_DuckNoOrNot {
	public static void main(String[] args) {
		int num = 1203, flag = 0, rem;
		while (num != 0) {
			rem = num % 10;
			if (rem == 0) {
				flag = 1;
			}
			num = num / 10;
		}
		System.out.println(flag == 1 ? "DuckNo" : "Not a DuckNo");
	}
}
