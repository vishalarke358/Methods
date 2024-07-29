//To show non argument/ non static method method.


package allmethods;

public class no_argument_method
{
     int a=105;//instance variable
     int b=35;
     int c;
     
     public void add()//first method
     {
    	 System.out.print("output of given variable is="); //display in form
    	 c=a+b; //operation
    	 System.out.println(c); //to show operation
     }
     
     public void sub() // second method
     {
    	 System.out.print("output of subtraction is= ");
    	 c=a-b;
    	 System.out.println(c);
     }
     
     public void multi()
     {
    	 System.out.print("output of multiplication is= ");
    	 c=a*b;
    	 System.out.println(c);
     }
     
     public void div()
     { 
    	 System.out.print("output od division is= ");
         c=a/b;
         System.out.println(c);
     }
     
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		no_argument_method j=new no_argument_method();//object create
		
		
		j.add();//calling function
		
		j.sub();
		
		j.multi();
		
		j.div();
		
	}

}
