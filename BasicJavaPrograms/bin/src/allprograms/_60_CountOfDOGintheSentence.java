package allprograms;

public class _60_CountOfDOGintheSentence {
	public static void main(String[] args) {
		String s = "hiDog animal Dog Dog tej";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'D' && s.charAt(i + 1) == 'o' && s.charAt(i + 2) == 'g') {
				count++;
			}
		}
		System.out.println("Count of DOG in the sentence : "+count);
	}
}
