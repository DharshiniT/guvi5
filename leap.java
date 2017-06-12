import java.io.*;
import java.util.*;
class leap
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		 int a=s.nextInt();
		 if(a%4==0)
		 System.out.print("leap year");
		 else
		 System.out.print("non leap year");
	}
}
