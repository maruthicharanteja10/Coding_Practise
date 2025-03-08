package allprograms;

public class _65_ConvertArrayToString {
	public static void main(String[] args) {
         char arr[]= {'a','p','p','l','e'};
         //method-1
         String str="";
         for(int i=0;i<arr.length;i++) {
        	 str=str+arr[i];
         }
         System.out.println(str);
         //method-2
         String s1=new String(arr);
         System.out.println(s1);
	}
}
