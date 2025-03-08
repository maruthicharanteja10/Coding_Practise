package allprograms;

public class _72_ReverseTheStringWithoutReversingWords {
	public static void main(String[] args) {
		String s = "hello hi bye welcome";
		String[] arr = s.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
