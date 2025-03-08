package allprograms;

public class _09_LeapOrNot {
	public static void main(String[] args) {
		int year = 2040;
		if ((year % 4 == 0 && (year % 100 != 0)) || ((year % 400 == 0))) {
			System.out.println("leap year");
		} else {
			System.out.println("Not a leap year");
		}
	}
}
