import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


public class EvenOdd {

	public static void evenodd() throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		//String str = br.readLine();
		//int a = Integer.parseInt(str);
		Scanner scr = new Scanner(System.in);
		int a = scr.nextInt();
		if(a%2 == 0){
			System.out.println(a + "-" + "Number is Even");
		}else {
			System.out.println(a + "-" + "Number is Odd");
		}

	}

}
