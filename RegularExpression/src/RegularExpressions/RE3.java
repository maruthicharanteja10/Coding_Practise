package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE3 {
	public static void main(String[] args) {
		//starting with a or A
		String s="charan";
		Pattern p=Pattern.compile("[a,A].*");
		Matcher m=p.matcher(s);
		System.out.println(m.matches());
	}
}
