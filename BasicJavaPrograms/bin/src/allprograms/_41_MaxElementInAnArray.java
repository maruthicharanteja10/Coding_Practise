package allprograms;
import java.util.Scanner;
public class _41_MaxElementInAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		System.out.println("Enter the input values");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int  max = a[0];
		System.out.println("the Output Values");
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("MaxOf elemenets in an Array:" + max);
	}
}
