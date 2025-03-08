package allprograms;

public class _70_CountOfEachCharInString {
	public static void main(String[] args) {
		String s = "hello string";
		int arr[] = new int[128];
		for (int i = 0; i < s.length(); i++) {
           arr[s.charAt(i)]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				char c=(char)i;
				System.out.println(c+"-"+arr[i]);
			}
		}
	}
}