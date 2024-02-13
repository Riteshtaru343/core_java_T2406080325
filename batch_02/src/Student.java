
public class Student {
	private int rollNo;
	private String name;
	
	public Student()
	{
		this(2,"Ritesh");
		System.out.println("Default Constructor Called");
	}
	public Student(int rollNo, String name)
	{
//		this();
		System.out.println("Parametrized Construvctor called");
		this.rollNo=rollNo;
//		this.name;
	}
	public String toString() {
		return "Student [rollNo="+ rollNo+ ", name="+name+"]";
	}
	public static void main(String args[])
	{
		Student s=new Student(1,"omkar");
		System.out.println(s);
//		Student s= new Student();
//		System.out.println(s);
				
		
	}

}
