package allprograms;
public class _45_RearrangeArrayZerosToleftElementsToRight {
	public static void main(String[] args) {
		int a[] = { 23, 0, 24, 0, 6, 7, 0, 8 };
		int left = 0;
		int right = a.length - 1;
		while (left <= right) {
			if (a[left] != 0 && a[right] == 0) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
			} else if (a[left] == 0) {
				left++;
			} else if (a[right] != 0) {
				right--;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
//Rearrange the array by all non-zero elements towards the right and zero towards the left side.   
//Input: 23 0 24 0 6 7 0 8
//Output:0 0 0 23 24 6 7 8
