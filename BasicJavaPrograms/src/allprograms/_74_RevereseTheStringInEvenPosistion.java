package allprograms;

public class _74_RevereseTheStringInEvenPosistion {
	public static void main(String[] args) {
		String str = "hello hi bye abcd welcome";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 1) {
				String s = arr[i];
				String rev = " ";
				for (int j = s.length()-1; j >= 0; j--) {
					rev = rev + s.charAt(j);

				}
				System.out.print(rev+" ");
			} else {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
