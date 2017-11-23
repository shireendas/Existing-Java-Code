
public class Relationaloperators {

	public static void main(String[] args) {
		
		int a = 5, b= 5;
		System.out.println(a==b); //a==b will return 'true' as 3==3 is true
		System.out.println(a!=b); //a!=b will return 'false' as 3!=3 is false
		
		int c=6,d=6,e=8;
		System.out.println("c is less than d is " + (c<d));
		System.out.println("e is less than d is " + (e<d));
		System.out.println("c is greater than d is " + (c>d));
		System.out.println("e is greater than d is " + (e>d));
		
		System.out.println("c is less than or equals to d is " + (c<=d));
		System.out.println("c is less than or equals to e is " + (c<=e));
		System.out.println("e is less than or equals to d is " + (e<=d));
		
		System.out.println("c is greater than or equals to d is " + (c>=d));
		System.out.println("c is greater than or equals to e is " + (c>=e));
		System.out.println("e is greater than or equals to d is " + (e>=d));

	}

}
