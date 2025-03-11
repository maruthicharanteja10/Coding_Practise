package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE7 {
public static void main(String[] args) {
	//starts with special characters
	String s="charan";
	Pattern p=Pattern.compile("[^a-z,^A-Z,^0-9].*");
	Matcher m=p.matcher(s);
	System.out.println(m.matches());

}
}
