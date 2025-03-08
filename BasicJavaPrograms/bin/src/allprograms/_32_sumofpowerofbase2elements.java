package allprograms;

public class _32_sumofpowerofbase2elements {
	public static int power(int base, int exp) {
		int p=1;
		for(int i=1;i<=exp;i++) {
			p=p*base;
		}
		return p;
	}
	public static void main(String[] args) {
		int n = 126, exp = 2, rem = 0,sum=0;
		while (n != 0) {
			rem = n % 10;
            sum=sum+power(rem,exp);
            n=n/10;
		}
		System.out.println(sum);
	}
}
