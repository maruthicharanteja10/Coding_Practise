package allprograms;

public class _25_NthPrimeNo {
	public static boolean Nprime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count==2?true:false;
	}

	public static void main(String[] args) {
		int input = 7, start = 2, count = 0;
		for (int i = 0;; i++) {
			if (Nprime(i)) {
				count++;
			}
			if (count == input) {
				System.out.println(i);
				break;
			}
		}
	}
}
