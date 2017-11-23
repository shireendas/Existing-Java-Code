
public class ReserveString {
		 
		public static void reservestring() {
			
			String s = "Shireen";
			char c[] = s.toCharArray();
			int l = c.length;
			char rev[] = new char[l];
			
			for (int i=l-1;i>=0;i--){
				rev[l-1-i] = c[i];
				
			}
			System.out.println(rev);
			
		}

	}

