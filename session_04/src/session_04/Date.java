package session_04;

public class Date {
	private int dd,mm,yy;
//	private final float PI;
//	
//	public Date()
//	{
//		PI=3.14f;
//	}
	
	public Date(int dd, int mm, int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public String toString()
	{
		return "Date="+dd+"/"+mm+"/"+yy;
	}
//	public static void main(String args[])
//	{
//		final Date d=new Date(12,2,2024);
//	}
}
