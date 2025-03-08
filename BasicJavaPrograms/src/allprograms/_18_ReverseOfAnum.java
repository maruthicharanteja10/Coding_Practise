package allprograms;

public class _18_ReverseOfAnum {
	public static void main(String[] args) {
         int num=123,rem=0;
         while(num!=0) {
        	 rem=num%10;
        	 System.out.print(rem);
        	 num=num/10;
         }
	}
}
