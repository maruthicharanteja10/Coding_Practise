package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE10 {
public static void main(String[] args) {
	//4-6 characters Alphabet 3-5 characters Numeric
	String s="charan";
	Pattern p=Pattern.compile("[a-z,A-Z]{4,6}[0-9]{3,5}");
	Matcher m=p.matcher(s);
	System.out.println(m.matches());
}
}
