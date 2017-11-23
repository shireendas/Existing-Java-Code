
public class Do_While {

	public static void main(String[] args) {
		
		int i = 0;
		int j = 10;
		do{
			System.out.print(i);
			i++;
		}
		while(i<=10);
		System.out.println();
		do{
			System.out.print(j);
			j--;
		}
		while(j>=0);
		/*do{// it will print infinite loop 
			System.out.println("Infinite Loop");
		}
		while(true);*/
		
	}

}
