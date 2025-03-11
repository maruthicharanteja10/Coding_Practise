package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE8 {
public static void main(String[] args) {
	//string contains only 6 characters
	String s="charan";
	Pattern p=Pattern.compile("[a-z,A-Z]{6}");
	Matcher m=p.matcher(s);
	System.out.println(m.matches());
}
}
