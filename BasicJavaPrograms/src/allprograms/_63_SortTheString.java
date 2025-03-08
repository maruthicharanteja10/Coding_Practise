package allprograms;

public class _63_SortTheString {
	public static void main(String[] args) {
		String s = "fedbac";
		char[] arr = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
                 if(arr[i]>arr[j]) {
                	 char temp=arr[i];
                	 arr[i]=arr[j];
                	 arr[j]=temp;
                 }
			}
		}
		String ans=new String(arr);
		System.out.println(ans);
	}
}
