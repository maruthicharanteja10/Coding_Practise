package allprograms;

public class _58_LongestWordInaSentenece {
	public static void main(String[] args) {
		String s = "This is an example sentence with some long words";
		String[] word = s.split(" ");
		String longestword = "";
		for (int i = 0; i < word.length; i++) {
			if (word[i].length() > longestword.length()) {
				longestword = word[i];
			}
		}
		/*
		 * using Enhanced Forloop
		 *  for (String words : word) { 
		 *  if (words.length() >longestword.length()) {
		 *   longestword = words;
		 *    } }
		 */
		System.out.println("Longest word in the senetence : " + longestword);
	}
}
