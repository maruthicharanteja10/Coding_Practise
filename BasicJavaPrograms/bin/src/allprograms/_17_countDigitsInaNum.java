package allprograms;

public class _17_countDigitsInaNum {
	public static void main(String[] args) {
      int num=8798798,rem=0,count=0;
      while(num!=0) {
    	  rem=num%10;
    	  count++;
    	  num=num/10;
      }
      System.out.println("No.ofdigitsInaNum : "+count);
	}
}
