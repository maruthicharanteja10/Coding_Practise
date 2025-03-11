package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE2 {

	public static void main(String[] args) {
		//ending with z
		String s="charan";
		Pattern p=Pattern.compile("*.z");
		Matcher m=p.matcher(s);
		System.out.println(m.matches());

	}

}
