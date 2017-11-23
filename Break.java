
public class Break {

	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++){
			if (i==5){
			break;
			}
			System.out.println(i);
		}
		
		for(int j=1;j<=3;j++){
			for(int k=1;k<=3;k++){
				if(j==2 && k==2){
					break;
				}
				System.out.println(j + " " + k);
			}
			
		}

	}

}
