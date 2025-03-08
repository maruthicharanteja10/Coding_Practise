package allprograms;

public class _61_countOfCodeWhereDisNotInCode {
	public static void main(String[] args) {
		String s = "coze xx copecodecoee";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'c' && s.charAt(i + 1) == 'o' && s.charAt(i + 3) == 'e') {
				count++;
			}
		}
		System.out.println("count of code without D in the code of a sentence : " + count);
	}
}

