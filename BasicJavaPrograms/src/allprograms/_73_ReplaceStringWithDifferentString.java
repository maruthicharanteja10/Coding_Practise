package allprograms;

public class _73_ReplaceStringWithDifferentString {
	public static void main(String[] args) {
		String s = "hello hi bye abcd";
		String[] arr = s.split(" ");
		String cur = "abcd";
		String repl = "teja";
		for (String ele : arr) {
			if (ele.equals(cur)) {
				System.out.print(repl + " ");
			} else {
				System.out.print(ele + " ");
			}
		}
	}
}
