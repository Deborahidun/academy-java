package _12_exception_handling;
//

//public class ExceptionTemplate {
//
//	
//	
//	 Step 1: Method that throws an exception
//	public static <ReturnType> methodName(<Parameters>) throws <ExceptionType> {
//	     Step 2: Identify and handle problem area
//	    if (<ProblemCondition>) {
//	        throw new <ExceptionType>("Optional error message");
//	    }
//	    
//	    Normal method logic
//	    return <ValidReturn>;
//	}
//
//	 Step 3: Method that calls the method throwing exception
//	public static void main(String[] args) {
//	    try {
//	         Call the method that may throw an exception
//	    <ReturnType> result = methodName(<Parameters>);
//	     System.out.println("Result: " + result);
//	        
//	   } catch (<ExceptionType> e) {
//	         Step 4: Handle the exception here
//	        System.out.println("Error: " + e.getMessage());
//	        
//	    } finally {
//	        Step 5: (Optional) Clean up resources if needed
//	        System.out.println("End of program.");
//	    }
//	}
//
//}

class MyCustomException extends Exception {
	public MyCustomException(String message) {
		super(message);
	}
}
