//To show Argument method

package allmethods;

public class argument_method {
 
     float m=1;
     float n=3;
     float o;
     
     public void sub(int u) //first method with Argument
    	 {
    	 System.out.print("1)The output of Subtraction is= ");
    	 o=n-m;
    	 System.out.println(o);
    	 }
     
     public void div(int v, int w)  //Second method with Argument
         {
    	 System.out.print("2)The output of Division is= ");
    	 o=n/m;
    	 System.out.println(o);
         }
    	 
     
     public void add(int e)  //Third method with Argument
         {
    	 System.out.print("3)The output of Addition is= ");
    	 o=m+n;
    	 System.out.println(o);
         }
     
     
     public void multi(int f)  //fourth method with Argument
         {
    	 System.out.print("4)The output of Multiplication is= ");
    	 o=m*n;
    	 System.out.println(o);
         }
     
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		argument_method t=new argument_method();  //create object
		
		t.sub(1);   //calling function
		t.div(2,3);
		t.add(4);
		t.multi(5);
		
	}

}