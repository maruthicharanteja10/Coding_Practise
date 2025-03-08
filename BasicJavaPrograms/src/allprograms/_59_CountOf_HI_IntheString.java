package allprograms;

public class _59_CountOf_HI_IntheString {
	public static void main(String[] args) {
		String s = "hellohi bye hi hi hi";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'h' && s.charAt(i + 1) == 'i') {
				count++;
			}
		}
		System.out.println("count of HI in the string : "+count);
	}
}
