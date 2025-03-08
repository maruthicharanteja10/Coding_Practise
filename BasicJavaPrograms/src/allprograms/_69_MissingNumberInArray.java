package allprograms;

public class _69_MissingNumberInArray {
	public static void main(String[] args) {
		int a[] = { 3, 4, 5, 1 };
		// method-1
		int sum = 0, sum1 = 15;
		for (int ele : a) {
			sum = sum + ele;
		}
		System.out.println("missing number :" + (sum1 - sum));
		System.out.println("-------------------------------------");
		// method-2
		for (int i = 1; i <= a.length; i++) {
			boolean flag = false;
			for (int ele : a) {
				if (i == ele) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println(i);
				break;
			}
		}
		// method-3
		int n = 5;
		int[] temp = new int[n + 1];
		for (int ele : a) {
			temp[ele] = 1;
		}
		for (int i = 1; i < temp.length; i++) {
			if (temp[i] == 0) {
				System.out.println(i);
				break;
			}
		}
	}
}
