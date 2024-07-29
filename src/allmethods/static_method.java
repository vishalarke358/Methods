//to show static method

package allmethods;

public class static_method 
{

	static long a=45;//instance variable
	static long b=15;
	static long c;		
	
	public static void div()//first method
	
	{
		System.out.print("output of division is = ");//to show output
		c=a/b;//operation
		System.out.println(c);//for to print	
	}

	public static void multi()//second method
	{
		System.out.print("output of multiplication is= ");
		c=a*b;
		System.out.println(c);
	}
	
	public static void sub()//third method
	{
		System.out.print("output of subtraction is = ");
		 c=a-b;
		 System.out.println(c);
	}
	
	public static void add()//fourth method
	{
		
		System.out.print("output of addition is = ");
		c=a+b;
		System.out.println(c);
	}	
	
	
	public static void main(String[] args)//pre define method
	
	{
		// TODO Auto-generated method stub

		
		 static_method.div();
		 static_method.multi();
		 static_method.sub(); 
		 static_method.add(); 
	}

}
