package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE9 {
	public static void main(String[] args) {
		String s = "char8920";
		Pattern p = Pattern.compile("[a-z,A-Z]{4}[0-9]{4}");
		Matcher m = p.matcher(s);
		System.out.println(m.matches());
	}
}
