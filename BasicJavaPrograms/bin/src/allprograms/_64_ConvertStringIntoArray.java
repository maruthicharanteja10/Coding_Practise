package allprograms;

public class _64_ConvertStringIntoArray {
	public static void main(String[] args) {
		String s = "hello";
		// method-1
		char arr[] = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// method-2
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			System.out.println(c);
		}
	}
}
