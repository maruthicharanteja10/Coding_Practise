package allprograms_company; 

import java.util.Scanner;

public class EmployeeDbApp {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		EmployeeDb e1 = new EmployeeDb();
		System.out.println("=====welcome to employeeDb=====");
		System.out.println("1.AddEmployee\n2.Total-employee\n3.Search Employee by id\n4.Update by Eid");
		System.out.println("5.Remove by Eid\n6.exit");
		System.out.println("Enter the Option:-");
		int op = ip.nextInt();
		switch (op) {
		case 1:
			System.out.println("------Insert Employee------");
			e1.addEmployee();
		case 2:
			System.out.println("---------Total Employee------");
			System.out.println(e1.totalEmp());

			break;
		case 6:
			System.out.println("------Thank you for visit again----");
		default:
			System.out.println("-----Invalid Option-----");
		}
	}
}
