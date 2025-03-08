package allprograms;

public class _80_ReverseOfHalfOfString {
	public static void main(String[] args) {
		String s = "jspiders";
		//method-1
		String rev1 = "";
		int mid = s.length() / 2;
		for (int i = 0; i < mid; i++) {
			rev1 = rev1 + s.charAt(i);
		}
		for (int i = s.length() - 1; i >= mid; i--) {
			rev1 = rev1 + s.charAt(i);
		}
		System.out.println(rev1);
		//method-2
		String rev2="";
		for (int i = s.length()-1; i >=mid; i--) {
			rev2 = rev2+ s.charAt(i);
		}
		for (int i = 0; i <mid; i++) {
			rev2 = rev2 + s.charAt(i);
		}
		System.out.println(rev2);
	}
}
