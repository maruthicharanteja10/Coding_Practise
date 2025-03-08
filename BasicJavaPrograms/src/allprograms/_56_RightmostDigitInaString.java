package allprograms;

public class _56_RightmostDigitInaString {
	public static void main(String[] args) {
		String s = "abc123";
		char c = s.charAt(s.length() - 1);
		if (c >= '0' && c <= '9') {
			System.out.println("rightmost digit in a string :" + c);
		} else {
			System.out.println("Digit is not present");
		}
	}
}
