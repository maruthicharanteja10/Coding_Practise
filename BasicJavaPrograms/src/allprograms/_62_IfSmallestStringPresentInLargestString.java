package allprograms;

public class _62_IfSmallestStringPresentInLargestString {
	public static boolean endOther(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		String rev = " ";
		if (a.length() > b.length()) {
			int k = a.length() - 1;
			for (int i = 1; i < b.length(); i++) {
				rev = a.charAt(k) + rev;
				k--;
			}
			return rev.equals(b);
		} else {
			int k = b.length() - 1;
			for (int i = 1; i < a.length(); i++) {
				rev = b.charAt(k) + rev;
				k--;
			}
		}
		return rev.equals(a);
	}

	public static void main(String[] args) {
		System.out.println(endOther("abc", "hiabc"));
	}
}
