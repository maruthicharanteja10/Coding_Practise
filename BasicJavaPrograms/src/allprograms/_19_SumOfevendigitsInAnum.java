package allprograms;

public class _19_SumOfevendigitsInAnum {
	public static void main(String[] args) {
		int num = 989289308, rem =0, sum = 0;
		while (num != 0) {
			rem = num % 10;
			if (rem % 2 == 0) {
				sum = sum + rem;	
			}
			num = num / 10;	
		}
		System.out.println("sumOfevendigitsInAnum"+sum);
	}
}
