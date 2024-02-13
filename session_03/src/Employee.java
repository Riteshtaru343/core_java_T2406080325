
public class Employee {
	private int empId;
	private String empName;
	private float empSal;
	private static int count;
	
	public Employee()
	{
		
	}
	public Employee(int empId, String empName, float empSal)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
		count++;
	}
	public static int getCount()
	{
		return count;
	}
	public String toString()
	{
		return "Emlployee [empId=" +empId+ "' "+ "empName="+empName+"' "+ "empSal="+empSal+"]";
	}
//	static()
//	{
//		System.out.println("Static Block Called");
//		count=60
//	}
	
	public static void main(String arg[])
	{
		Employee e1=new Employee(111,"Ritesh",50678.45f);
		Employee e2=new Employee(222,"Omkar", 56678.89f);
		Employee e3=new Employee(333,"Ankit",55567.79f);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		System.out.println("Employee Count= "+Employee.getCount());
	}

}
