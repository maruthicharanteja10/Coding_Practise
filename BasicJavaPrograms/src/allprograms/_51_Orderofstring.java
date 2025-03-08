package allprograms;
public class _51_Orderofstring {
	public static void main(String[] args) {
		String s = "Ghg785@He#%#$d4";
		String Alpha = "", num = "", spchar = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
				Alpha += c;
			} else if (c >= '0' && c <= '9') {
				num += c;
			} else {
				spchar += c;
			}
		}
		String result = Alpha + num + spchar;
		System.out.println(result);
	}
}
