package test;

public class test1 {
	public static void main(String[]args) {
		
		try {
			int x=0;
			for(x=1;x<4;x++);
			System.out.println(x);
			
		}
		catch(Exception ex) {
		System.out.println("b");
		}
		finally {
			System.out.println("ERROR");
			}
		
		
	}

	
	
}