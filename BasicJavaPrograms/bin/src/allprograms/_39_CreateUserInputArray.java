package allprograms;
import java.util.*;
public class _39_CreateUserInputArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a=new int[10];
		System.out.println("Enter the input values");
        for(int i=0;i<a.length;i++) {
        	a[i]=sc.nextInt();
        }
        System.out.println("the Output Values");
        for(int i=0;i<a.length;i++) {
        	System.out.println(a[i]);
        }
	}
}
