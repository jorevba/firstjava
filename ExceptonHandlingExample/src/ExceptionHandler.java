
public class ExceptionHandler {

	public static void main(String[] args) {
		
	    try {
		int[] myNumbers = {1, 2, 3};
	    System.out.println(myNumbers[10]); // error!
	    }catch (Exception e) {
			System.out.println("Out of range for the array declared");
		}
	
}}
		
	
       
	
   

