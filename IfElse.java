
public class IfElse {

	public static void ifelse() {
		
		int a = 85;
		if (a<50){
			System.out.println("Fail");
		}else if(a>50 && a<60){
			System.out.println("D Grade");
		}else if(a>60 && a<70){
			System.out.println("C Grade");
		}else if(a>70 && a<80){
			System.out.println("B Grade");
		}else if(a>80 && a<90){
			System.out.println("A Grade");
		}else if(a>90 && a<=100){
			System.out.println("A+ Grade");
		}else{
			System.out.println("InValid");
		}

	}

}
