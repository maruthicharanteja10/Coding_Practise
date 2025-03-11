package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE5 {
public static void main(String[] args) {
	//starts with numeric
	String s="1charan";
	Pattern p=Pattern.compile("[0-9].*");
	Matcher m=p.matcher(s);
	System.out.println(m.matches());

}
}
