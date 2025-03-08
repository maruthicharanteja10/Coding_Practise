package allprograms;

public class _68_ReplacetheArrayElementWithTheLargestElementTowardsRightSide {
	public static void main(String[] args) {
		int[] arr = { 12, 34, 89, 26, 75, 45, 55, 32 };
		int max = arr[arr.length - 1];
		for (int i = arr.length - 1; i >= 0; i--) {
			if (max <= arr[i]) {
				max = arr[i];
				arr[i] = -1;
			} else {
				arr[i] = max;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
