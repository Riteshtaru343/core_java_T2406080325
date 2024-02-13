
public class Date {
	private int dd, mm, yy;
	
	private void initDate()
	{ 
		dd=mm=yy=1;
	}
	public void setdate(int d, int m, int y)
	{
		dd=d;
		mm=m;
		yy=y;
		
	}
	public void displayDate()
	{
		System.out.println("Date=["+dd+"/" +mm+"/"+yy+"]");
	}
	public static void main(String args[]) {
		Date d= new Date();
		System.out.println(d.dd);
		d.initDate();
		d.displayDate();
		d.setdate(7, 2, 2024);
		d.displayDate();
	}

}
