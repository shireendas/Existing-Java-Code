
public class VariableScope {

	 /* public static void main(String args[])
	    {
	        int a=5;
	       AccessVariable( );  // Calling AccessVariable() method, which will in turn will try to print the variable 'a' whose scope is limited to this method only
	    }

	    public static void AccessVariable( )
	    {
	       System.out.println("a = "+a);     //Trying to print the variable 'a' whose scope is limited to main( ) method only
	    } */
	
	/*public static void main(String args[])
    {                                                             // Outer scope started
         int a=5;

         if(a>0)         
         {                                                        // Inner scope started
              System.out.println("a="+a);
         }                                                      // Inner scope ended
   
     }       */
	
	/* public static void main(String args[])
    {                             // Outer scope started

             if(true)
             {                      // Inner scope started
                   int a=5;
             }                     // Inner scope ended

       System.out.println("a="+a);

     }                           // Outer scope ended */
	
	/* public static void main(String args[])
     {
          a=5;   //First use the variable
          int a;  //Second declare the above used variable

         System.out.println("a="+a);

     }*/
	
	 /* public static void main(String args[])
	     {
	         int a;

	           if(true)
	          {
	                int a;
	           }

	     } */
	}

