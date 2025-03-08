package allprograms;

public class _79_LongestPalindromeInAString {
	static boolean isPalindrome(String s) {
		String res = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			res = res + s.charAt(i);
		}
		return s.equals(res);
	}

	public static void main(String[] args) {
		String s = "abvfsgabbagsjkw";
		String max = " ";
		for (int i = 0; i < s.length(); i++) {
			String temp = " " + s.charAt(i);
			for (int j = i + 1; j < s.length(); j++) {
				temp = temp + s.charAt(j);
				if (isPalindrome(temp)) {
					if (temp.length() > max.length()) {
						max = temp;
					}

				}
				System.out.println(max);
			}
		}
	}
}
