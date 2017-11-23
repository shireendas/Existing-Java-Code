
public class For_Loop {

	public static void main(String[] args) {
		int arr[] = {23,45,67,89};
		
		for(int i=0;i<=10;i++){//for loop 
			System.out.print(i);
		}
		System.out.println();// writing this blank println outside of for loop to prnt the next function result in 2nd line
		for(int k=10;k>=0;k--){// for loop
			System.out.print(k);
		}
		System.out.println();//writing this blank println outside of for loop to prnt the next function result in 2nd line
		for(int j:arr){// for-each loop It works on elements basis not index. It returns element one by one in the defined variable.
			System.out.println(j);
		}
		/*for(;;){ //If you use two semicolons ;; in the for loop, it will be infinitive for loop.
			System.out.println("Infinite Loop");
		}*/

	}

}
