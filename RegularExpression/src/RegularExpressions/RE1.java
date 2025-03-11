package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE1 {

	public static void main(String[] args) {
		//string starting with c
		String s="charan";
		Pattern p=Pattern.compile("c.*");
		Matcher m=p.matcher(s);
		System.out.println(m.matches());

	}

}
