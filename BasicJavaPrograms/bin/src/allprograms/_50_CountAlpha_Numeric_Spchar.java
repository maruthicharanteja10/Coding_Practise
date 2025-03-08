package allprograms;
import java.util.Scanner;
public class _50_CountAlpha_Numeric_Spchar {
	public static void main(String[] args) {
		String s = "Ghg785@He#%#$d4";
		int Alphacount = 0, numcount = 0, spcharcount = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
				Alphacount++;
			} else if (c >= '0' && c <= '9') {
				numcount++;
			} else {
				spcharcount++;
			}
		}
		System.out.println(
				"Alphacount: " + Alphacount + "\n" + "Numbercount: " + numcount + "\n" + "spcharcount: " + spcharcount);
	}
}
