package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE4 {
public static void main(String[] args) {
	//contain abc
	String s="charan";
	Pattern p=Pattern.compile(".*abc.*");
	Matcher m=p.matcher(s);
	System.out.println(m.matches());

}
}
