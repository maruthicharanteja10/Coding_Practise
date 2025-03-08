package allprograms;

public class _31_powerOfanumber {
	public static void main(String[] args) {
		int base = 2, exp = 3,pow=1;
         for(int i=1;i<=exp;i++) {
        	 pow=pow*base;
         }
         System.out.println(pow);
	}
}
