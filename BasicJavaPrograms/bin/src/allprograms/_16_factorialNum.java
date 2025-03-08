package allprograms;

public class _16_factorialNum {
	public static void main(String[] args) {
		int num = 5, fact = 1;
		while (num!= 0) {
			fact = fact * num;
			num--;		
		}
		System.out.println("factorial :" + fact);
	}
}
