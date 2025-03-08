package allprograms;

public class _57_StringContainsDigitAndItShouldBeRightmostDigit {
	public static void main(String[] args) {
		String s = "abc123";
		int flag = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Digit present in the string");
			char c1 = s.charAt(s.length() - 1);
			System.out.println("rightmost digit present in the string : "+ c1);
		} else {
			System.out.println("Digit is not present");
		}
	}
}
