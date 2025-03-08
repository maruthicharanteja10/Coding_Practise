package allprograms;
public class _52_SumofnumInaString {
	public static void main(String[] args) {
		String s = "hello122hi56byebye123";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') {
				sum = sum + (c - 48);
			}
		}
		System.out.println(sum);
	}
}
