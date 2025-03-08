package allprograms;

public class _13_PrimeOrnot {
	static boolean isprime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isprime(7) ? "prime no" : "Not a Prime");
		/*
		 * public static String prime(int n) { 
		 * for (int i = 1; i <= n; i++) { 
		 * if (n %i== 0) {
		 *  count++;
		 *   } 
		 * }
		 *   return count==2?"prime":"not prime"; }
		 */
	}
}
