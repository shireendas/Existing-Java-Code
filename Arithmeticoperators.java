
public class Arithmeticoperators {

	public static void main(String[] args) {
		
		//Program to demonstrate the Addition operator
		int a = 1+9;
		System.out.println("a = " + a);
		int e = 12 - 7;
		System.out.println("e = " + e);
		int i = 2 * 5;
		System.out.println("i = " + i);
		int m = 12 / 6;
		System.out.println("m = " + m);
		
		//Adding two decimal numbers and storing in an int type variable
		// int b = 5.5 + 7.5; //Adding two decimal numbers i.e. 5.5 and 3.2 and storing the result in the int type variable 'b'
		//We cant assign decimal values to the int type variables.
		//by adding type cast to the decimal values, the program will not throw the error, digits after the decimal points will be ignored while adding.
		
		int b = (int)5.5 + (int)7.5; //Type casting the flote values to int
		System.out.println("b = " + b);
		int f = (int)9.5 - (int)7.5;
		System.out.println("f = " + f);
		int j = (int)9.5 * (int)7.5;
		System.out.println("j = " + j);
		int n = (int)5.5 / (int)3.2;
		System.out.println("n = " + n);
		
		double c = 5 + 4;//Adding two integers i.e. 5 and 3 and storing the result in the double type variable 'a'
		System.out.println("c = " + c);
		double g = 9 - 7;
		System.out.println("g = " + g);
		double k = 9 * 7;
		System.out.println("k = " + k);
		double o = 5 / 3;
		System.out.println("o = " + o);
		
		double d = 4.5 + 5.3;
		System.out.println("d = " + d);
		double h = 8.5 - 5.3;
		System.out.println("h = " + h);
		double l = 8.5 * 5.3;
		System.out.println("l = " + l);
		double p = 5.0 / 3;
		System.out.println("p = " + p);
		
		//The Modulus operator '%' returns the reminder of a division operator.
		int q = 8%3;
		System.out.println("q = " + q);
		double r = 8.568%3;
		System.out.println("r = " + r);
		
		//Java provides special operators called Compound Assignment operators which combine an arithmetic operation with an assignment '='
		int s = 4;
		s+= 3;//you need to write s+= no space between + and = for compound assignment otherwise it will throw an error
		//Using Compound assignment operator to increment the variable 's' value by 3 i.e. 4+3
		System.out.println("s = " + s);
		int t = 4;
		t-= 3;
		System.out.println("t = " + t);
		int u = 4;
		u*= 3;
		System.out.println("u = " + u);
		int v = 4;
		v/= 2;
		System.out.println("v = " + v);
		int w = 5;
		w%= 3;
		System.out.println("w = " + w);
		
		int x = 4;
		x++;
		System.out.println("x = " + x);
		int y = 4;
		++y;
		System.out.println("y = " + y);
		
		int pre = 4;
		System.out.println("The value of variable 'pre' before incremental using prefix operator = " + pre);
		System.out.print("The value of variable 'pre' while incremental using prefix operator = " );
		System.out.println(++pre); //(Incremented and printed)
		System.out.println("The value of variable 'pre' after incremental using prefix operator = " + pre);
		
		int post = 4;
		System.out.println("The value of variable 'post' before incremental using prefix operator = " + post);
		System.out.print("The value of variable 'post' while incremental using prefix operator = " );
		System.out.println(post++); //(Printed without increment)
		System.out.println("The value of variable 'post' after incremental using prefix operator = " + post); //(Incremented here)
		
		int a1 = 1;
		int b1 = 1;
		int c1 = ++b1;
		int d1 = a1++;
		
		System.out.println("a1 = " + a1);
		System.out.println("b1 = " + b1);
		System.out.println("c1 = " + c1);// Here the value of variable 'b1' will get incremented first and then the incremented value gets assinged to vartiable 'c1'
		System.out.println("d1 = " + d1); // Here the value of variable 'a1' will get assigned to variable 'd' and later the value of variable 'a1' gets incremented
		
		int pren = 4;
		System.out.println("The value of variable 'pren' before incremental using prefix operator = " + pren);
		System.out.print("The value of variable 'pren' while incremental using prefix operator = " );
		System.out.println(--pren); //decremented and printed)
		System.out.println("The value of variable 'pren' after incremental using prefix operator = " + pren);
		
		int postn = 4;
		System.out.println("The value of variable 'postn' before incremental using prefix operator = " + postn);
		System.out.print("The value of variable 'postn' while incremental using prefix operator = " );
		System.out.println(postn--); //(Printed without decremented)
		System.out.println("The value of variable 'postn' after incremental using prefix operator = " + postn); //(decremented here)
		
		int a2 = 1;
		int b2 = 2;
		int c2 = --b2;
		int d2 = a2--;
		
		System.out.println("a2 = " + a2);
		System.out.println("b2 = " + b2);
		System.out.println("c2 = " + c2);// Here the value of variable 'b1' will get incremented first and then the incremented value gets assinged to vartiable 'c1'
		System.out.println("d2 = " + d2); // Here the value of variable 'a1' will get assigned to variable 'd' and later the value of variable 'a1' gets incremented

	}

}
