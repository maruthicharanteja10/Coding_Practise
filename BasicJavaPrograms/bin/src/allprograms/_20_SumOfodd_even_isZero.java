package allprograms;

public class _20_SumOfodd_even_isZero {
	public static void main(String[] args) {
		int num = 1430 ,rem=0,esum = 0,osum=0;
		while (num != 0) {
             rem=num%10;
             if(rem%2==0) {
            	 esum=esum+rem;
             }
             else {
            	 osum=osum+rem;
             }
             num=num/10;
		}
		System.out.println((esum-osum)==0?"Balanced":"Not Blanaced");
	}
}
