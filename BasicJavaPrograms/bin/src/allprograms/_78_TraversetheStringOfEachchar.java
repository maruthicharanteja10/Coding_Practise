package allprograms;

public class _78_TraversetheStringOfEachchar {
	public static void main(String[] args) {
		String s = "abcad";
		for (int i = 0; i < s.length(); i++) {
			String sub = "";
			for (int j = i; j < s.length(); j++) {
				sub = sub + s.charAt(j);
				System.out.println(sub);
			}
			System.out.println();
		}	
	}
}
