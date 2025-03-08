package allprograms_company;

//comparator and comparable program
public class Employee {
	private int empid;
	private String ename;
	private double sal;
	private String desgn;
	private long phno;

	public Employee(int empid, String ename, double sal, String desgn, long phno) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
		this.desgn = desgn;
		this.phno = phno;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getDesgn() {
		return desgn;
	}

	public void setDesgn(String desgn) {
		this.desgn = desgn;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "ComparatorProgram [empid=" + empid + ", ename=" + ename + ", sal=" + sal + ", desgn=" + desgn
				+ ", phno=" + phno + "]";
	}

}
