
public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	
	public Employee()
	{
		System.out.println("Default Constuctor called");
		empId=111;
		empName="Ritesh";
		empSalary=42100.67d;
	}
	public Employee(int i, String n,double d)
	{
		System.out.println("Parameterized Constuctor called");
		empId=i;
		empName=n;
		empSalary=d;
	}
	public String toString()
	{
		return "Employee= "+empId+" "+empName+" "+empSalary;
	}
	public static void main(String args[])
	{
		Employee e=new Employee();
		System.out.println(e);
		Employee el=new Employee(222,"Omkar",40000.67d);
		System.out.println(el);
	}

}
