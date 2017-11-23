
public class ConversionType {

	/*//Java will perform the conversion automatically when the value and variables types are different but compatible.
    public static void main(String[] args) {
		long a=123;    // We have assigned an integer value to a variable which is declared as long knowing that the both types are different but compatible
        System.out.println("a="+a);

	} */
    
    /* // Java wont perform the conversion automatically when the value and variables types are not compatible.
    public static void main(String args[])
    {
          int a=123.456;    // We have assigned a decimal value to a variable which is declared as int knowing that both types are not compatible
          System.out.println("a="+a);
    } */
	
	/* //usage of cast in converting the integer value to byte value while assigning the integer value to a byte variable.
	 public static void main(String args[])
	   {
	         byte a = (byte)12345;  // We've used (byte) cast for converting the integer value '12345' in to byte format before storing in the byte variable 'a'

	         System.out.println("a="+a); //(byte) cast in this program converted the integer value 12345 into a byte value 57.
	   } */
	
	/* //usage of cast in converting the decimal value to int value while assigning the decimal value to an int variable. 
	public static void main(String args[])
	   {

	         int a=(int) 323.142;   // We've used (int) cast for converting the decimal value '323.142' in to int format before storing in the int variable 'a'

	         System.out.println("a="+a);

	   } */
	
	/* //Values in the expression gets promoted to match the second argument to each binary operator.
	public static void main(String args[])
	   {

	         int a=5;             // a is of int type
	         double b=0.55;  // b is of double type

	         System.out.println(a+b);  // The result of a+b expression will get promoted to double as one of the variable i.e. 'b' has type double and other variable 'a' has type int 

	   } */

}
