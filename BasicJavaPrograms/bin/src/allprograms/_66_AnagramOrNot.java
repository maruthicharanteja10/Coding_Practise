package allprograms;

public class _66_AnagramOrNot {
	static String sort(String s) {
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j< arr.length; j++) {
				if (arr[i] > arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}}	}
		return new String(arr);
	}
	public static void main(String[] args) {
		String s1 = "hhelloi";
		String s2 = "ellihoh";
		String ans1=sort(s1);
		String ans2=sort(s2);
		System.out.println(ans1.equals(ans2)?"Anagram":"Not a Anagram");
	}
}
