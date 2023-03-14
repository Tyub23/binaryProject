import java.util.Scanner;

public class Code {
	Scanner keyboard=new Scanner (System.in);
	public Object converter ()
	{
		System.out.println("type 1 if you want to convert a decimal to binary, type 2 if you want to do the reverse");
		int input=keyboard.nextInt();
	
		if (input==1)
		{
			System.out.println("type the number you want to convert, in its original form");
			long number=keyboard.nextLong();
			return tenToTwo(number);
		}
		else if (input==2)
		{
			System.out.println("type the number you want to convert, in its original form");
			String number=keyboard.next();
			return twoToTen(number);
		}
		else
		{
			System.out.print("listen to directions");
			return 0;
		}
			
	}
	public String tenToTwo (long number)
	{
		String sum="";
		String real="";
		while (number>0)
		{
			if (number % 2==1)
			{
				sum+="1";
			}
			else
			{
				sum+="0";
			}
			number=number/2;
		}
		for (int i=sum.length()-1;i>=0;i--)
		{
			real+=sum.charAt(i);
		}
		System.out.print(real);
		return real;
	}
	public long twoToTen (String number)
	{
		long sum=0;
		for (int i=0;i<number.length();i++)
		{
			int num= Integer.parseInt(number.substring(i,i+1));
			if (num==1)
				sum+=Math.pow(2,number.length()-i-1);
		}
		
		System.out.print(sum);
		return sum;
	}
			
	

}
