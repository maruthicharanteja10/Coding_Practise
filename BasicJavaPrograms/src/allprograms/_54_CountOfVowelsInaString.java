package allprograms;
public class _54_CountOfVowelsInaString {
	public static void main(String[] args) {
		String s = "This is a really simple sentence";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
					|| (c == 'A' && c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
				count++;
			}
		}
		System.out.println("count of vowels in a string :" + count);
	}
}
