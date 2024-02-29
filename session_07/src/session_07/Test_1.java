package session_07;

public class Test_1 {
	public static void main(String[] args) {
		try
		{
			int c=0;
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println("c ="+c);
		}
		catch (NumberFormatException e)
		{
			System.out.println("Enter only integer values");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter atlest 2 values");
		}
		
		catch (Exception e)
		{
			System.out.println("Exception Occured!!");
		}
	}

}
