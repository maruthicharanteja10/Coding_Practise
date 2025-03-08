package allprograms;

public class _23_Contains8ThreeTimesOrNOt {
	public static void main(String[] args) {
		int num = 908988989, rem = 0, count = 0;
		while (num != 0) {
			rem = num % 10;
			if (rem == 8) {
				count++;
			}
			num = num / 10;
		}
		if (count < 3 || count > 3) {
			System.out.println("Not a lucky no");
		} else {
			System.out.println("Lucky NO");
		}
	}
}
