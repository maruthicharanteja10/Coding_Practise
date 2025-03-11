package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE6 {
public static void main(String[] args) {
	//NOT STARTS WITH ALPHABETS
	String s="21charan";
	Pattern p=Pattern.compile("[^a-z,^A-Z].*");
	Matcher m=p.matcher(s);
	System.out.println(m.matches());

}
}
