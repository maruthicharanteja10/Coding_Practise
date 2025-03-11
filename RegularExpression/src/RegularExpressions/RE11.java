package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE11 {
public static void main(String[] args) {
	//phone no start with 6,7,8,9 and length 10
	String s="9089898989";
	Pattern p=Pattern.compile("[6-9][0-9]{9}");
	Matcher m=p.matcher(s);
	System.out.println(m.matches());
}
}
