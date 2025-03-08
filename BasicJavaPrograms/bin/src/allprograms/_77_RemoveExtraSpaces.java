package allprograms;

public class _77_RemoveExtraSpaces {
	public static void main(String[] args) {
		String s = "hello  hi   bye  welcome    hi";
		char[] arr = s.toCharArray();
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ') {
				c++;
			} else {
				c = 0;
			}
			if (c > 1) {
				arr[i] = '\0';
			}
			if (arr[i] != '\0') {
				System.out.print(arr[i]);
			}
		}
	}
}
