import java.io.*;
import java.util.Scanner;
class Test2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);// .util
		System.out.print("INPUT NUMBER:");
		int b = sc.nextInt();
		System.out.print("\t"+b+"+"+5);
		try//.io
		{
			System.out.print("Enter input :");
			char x = (char)System.in.read();
			System.out.println(x);
		}
		catch (IOException x){}
		
	}
}
