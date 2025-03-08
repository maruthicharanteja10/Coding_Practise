package allprograms_company;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDb {

	ArrayList<Employee> l1 = new ArrayList<Employee>();
	Scanner ip = new Scanner(System.in);

	void addEmployee() {
		System.out.println("Enter the emply id :-");
		int eid = ip.nextInt();
		System.out.println("Enter the emply name:-");
		String name = ip.next();
		System.out.println("Enter the Emply sal:-");
		double sal = ip.nextDouble();
		System.out.println("Enter the emply designation:-");
		String desgn = ip.next();
		System.out.println("Enter the emply phneno;-");
		long phno = ip.nextLong();
		l1.add(new Employee(eid, name, sal, desgn, phno));
		System.out.println("Employee details has been stored succesfully");
	}

	int totalEmp() {
		return l1.size();
	}

	void getEmpByEid(int eid) {
		boolean flag=false;
		for(Employee ele:l1) {
			if(ele.getEmpid()==eid) {
				System.out.println();
				flag=true;
				break;
			}
			
		}

	}
}
