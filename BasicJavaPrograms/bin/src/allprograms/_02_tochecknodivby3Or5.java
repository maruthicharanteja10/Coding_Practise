package allprograms;

public class _02_tochecknodivby3Or5 {
	public static void main(String[] args) {

		int n = 7;
		if (n % 3 == 0 && n % 5 == 0) {
			System.out.println("divisible by 3 and 5");
		} else if (n % 3 == 0 && n % 5 != 0) {
			System.out.println("divisible by 3 only ");
		} else if (n % 3 != 0 && n % 5 == 0) {
			System.out.println("divisible by 5 only  ");
		} else {
			System.out.println("not divisile by 3 and 5");
		}

	}
}
