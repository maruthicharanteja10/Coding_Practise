package allprograms;
import java.util.Scanner;
public class _40_SumOfelementsInAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] a = new int[10];
		System.out.println("Enter the input values");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("the Output Values");
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("sumOf elemenets in an Array:" + sum);
	}
}
