package allprograms;

import java.util.Scanner;

public class _44_SumOfeleWithOneTimeOfmaxele {
	public static void main(String[] args) {
		int sum = 0;
		int a[] = { 11, 2, 11, 5, 11 };
		int max = a[0], count = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			if (max < a[i]) {
				max = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (max == a[i]) {
				count++;
			}
		}
		System.out.println("sumOf elemenets in an Array:" + (sum - (count - 1) * max));
	}
}

//sum of all elements more than one time max element only one time.
//Input11 2 11 5 11  output18  explanation 11+2+5
