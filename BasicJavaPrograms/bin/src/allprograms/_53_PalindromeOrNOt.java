package allprograms;
public class _53_PalindromeOrNOt {
	public static void main(String[] args) {
		String s = "madaM";
		String str = "";
		String s1 = s.toLowerCase();
		for (int i = s1.length() - 1; i >= 0; i--) {
			char c = s1.charAt(i);
			str = str + c;
		}
		System.out.println(s1.equals(str) ? "palindrome" : "Not a palindrome");
	}
}
