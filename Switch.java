
public class Switch {

	public static void main(String[] args) {
		
		int num = 20;
		switch(num){
		case 10 : System.out.println("10");break;
		case 20 : System.out.println("20");break;
		case 30 : System.out.println("30");break;
		default : System.out.println("Not in 10,20 or 30");
		}
		switch(num){//java switch statement is fall-through, means it executes all statement after first match if break statement is not used with switch cases.
		case 10 : System.out.println("10");
		case 20 : System.out.println("20");
		case 30 : System.out.println("30");
		default : System.out.println("Not in 10,20 or 30");
		}

	}

}
