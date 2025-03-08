package allprograms;

public class _01_swapnumbers {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int temp;
		System.out.println("using temp variables");
		System.out.println("before");
		System.out.println(a+" "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("after");
		System.out.println(a+" "+b);
		System.out.println("------------------");
		System.out.println("without temp variables");
		System.out.println("before");
		System.out.println(a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after");
		System.out.println(a+" "+b);
		System.out.println("-------------------");
		System.out.println("using xor operator");
		System.out.println("before");
		System.out.println(a+" "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("after");
		System.out.println(a+" "+b);
		
		
	}

}
