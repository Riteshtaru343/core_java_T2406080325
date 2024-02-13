
public class Employee_1 {
	private int empNo;
	private float salary;
	private static float totalSalary;
	private static int n=1;
	
	public Employee_1(float salary)
	{
		this.empNo=n++;
		this.salary=salary;
		
		totalSalary+=salary;
	}
	public String toString()
	{
		return "Employee_01[empNo="+empNo+", salary="+salary+",totalSalary="+totalSalary+"]";
	}
	public static void main(String arg[])
	{
		Employee_1 e1=new Employee_1(50678.89f);
		Employee_1 e2=new Employee_1(56678.56f);
		Employee_1 e3=new Employee_1(55567.76f);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		System.out.println("Total Salary= "+totalSalary);
	}
}

