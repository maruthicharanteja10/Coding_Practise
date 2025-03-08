package allprograms;
import java.util.Scanner;
public class _43_SumOfelementWithoutMaxelement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int a[] = { 11, 2, 5, 6, 11, 8, 3, 4 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
                max=a[i];
			}
			sum = sum + a[i];
		}
		System.out.println("sumOf elemenets in an Array:" + (sum-max));
	}
}
//Note: If the max element is repeated for more than one neglect it for only one time.
//Example Input: 8array size  [11 2 5 6 11 8 3 4]  output:39