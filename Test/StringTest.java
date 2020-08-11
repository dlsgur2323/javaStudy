package Test;


public class StringTest {
	
	
	static void stop(int interval) {
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	public static void main(String[] args) {
	
		
		String intro = "\t대충 인트로 나오는 글";
		String intro2 = "대충 인트로2";
		for(int i = 0; i < intro.length(); i++){
			if(i >= 0)
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("=================================");
//			System.out.print("│");
			System.out.println("\n\n");
			if(i > intro.length()){
				int k = intro.length();
				System.out.println(intro.substring(0, k+1));
			} else {
				System.out.println(intro.substring(0, i+1));
			}
			System.out.print("\t\t");
			if(i >3){
				if( i > intro2.length()+3){
					int y = intro2.length();
					System.out.println(intro2.substring(0, y));
				} else{
					System.out.println(intro2.substring(0, i-3));
				}
			} else {
				System.out.println();
			}
			System.out.println("\n");
//			System.out.println("\t│");
			System.out.println("=================================");
			stop(500);			
		}	
			
	}	
}



















