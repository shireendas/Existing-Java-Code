
public class While_Loop {

	public static void main(String[] args) {
		
		int i = 0;
		int j = 10;
		while(i<=10){
			System.out.print(i + ",");
			i++;// if you remove this i++ then it will print 0 for infinite time 
		}
		System.out.println();
		while(j>=0){
			System.out.print(j + ",");
			j--;
		}
		/*while(true){// If you pass true in the while loop, it will be infinitive while loop.
			System.out.println("Infinite loop");
		}*/

	}

}
