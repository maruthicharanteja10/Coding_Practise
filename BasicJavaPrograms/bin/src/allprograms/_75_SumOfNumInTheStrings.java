package allprograms;

public class _75_SumOfNumInTheStrings {
	public static void main(String[] args) {
		String s1 = "7654";
		String s2 = "4512";
		int num = 0, num1 = 0;
		char[] arr1 = s1.toCharArray();
		for (char ele1 : arr1) {
			num = num * 10 + (ele1 - 48);
		}
		char[] arr2 = s2.toCharArray();
		for (char ele2 : arr2) {
			num1 = num1 * 10 + (ele2 - 48);
		}
		System.out.println("sum of 2numbered strings : " + (num + num1));
	}
}
