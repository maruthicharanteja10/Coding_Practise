package allprograms;

public class _76_CountSpacesInAString {
	public static void main(String[] args) {
		String s = "hello hibye tata";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ') {
				count++;
			}
		}
		System.out.println("Count Spaces in a given String" + count);
	}
}
