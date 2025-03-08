package allprograms;

public class _55_WhichVowelIsNotPresent {
	public static void main(String[] args) {
		String s = "This is a really simple sentence";
		int Acount = 0, Ecount = 0, Icount = 0, Ocount = 0, Ucount = 0;
		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			if (c == 'a' || c == 'A') {
				Acount++;
			} else if (c == 'e' || c == 'E') {
				Ecount++;
			} else if (c == 'i' || c == 'I') {
				Icount++;
			} else if (c == 'o' || c == 'O') {
				Ocount++;
			} else if (c == 'u' || c == 'U') {
				Ucount++;
			}
		}
		if (Acount == 0) {
			System.out.println("A vowel is not present");
		}
		if (Ecount == 0) {
			System.out.println("E vowel is not present");
		}
		if (Icount == 0) {
			System.out.println("I vowel is not present");
		}
		if (Ocount == 0) {
			System.out.println("O vowel is not present");
		}
		if (Ucount == 0) {
			System.out.println("U vowel is not present");
		}
	}
}
