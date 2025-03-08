package allprograms;

public class _81_AlphabetsOnlyReversed {
	public static void main(String[] args) {
		String s = "A6@BC$D";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				rev = rev + s.charAt(i);
			}
		}
		String ans = "";
		int k = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				ans = ans + rev.charAt(k);
				k++;
			} else {
				ans = ans + s.charAt(i);
			}
		}
		System.out.println(ans);
	}
}
