package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE12 {
public static void main(String[] args) {
	String s="charan12@gmail.com";
	Pattern p=Pattern.compile("[a-z,A-Z]{4,6}#*[0-9]{2,4}@gmail[.]com");
	Matcher m=p.matcher(s);
	System.out.println(m.matches());
}
}
