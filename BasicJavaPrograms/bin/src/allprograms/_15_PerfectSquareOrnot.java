package allprograms;

public class _15_PerfectSquareOrnot {
	static boolean isperf(int n) {
		for (int i = 1; i <= n; i++) {
			if (n  == i*i) {
				return true;
			}
		}
		return false;
	}
public static void main(String[] args) {
System.out.println(isperf(36)?"perfectno":"Not a perfectno");
/*
        int flag = 0;
		for (int i = 0; i <= n; i++) {
			if (n == i * i) {
				flag = 1;
				break;
			}
		}
		system.out.println( flag == 1 ? "perfect sq no" : "Not perfect square no");
 */
	}
}
