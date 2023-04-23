
package Assignment1;
import java.io.*; 
public class Question3 {
	//Single line comments
			static int i = 10; //int i with the variable 10
			 
			
	//Multiple line comments
			//let's declare and print the varible in java
			static int q = 10; 
			
			/* float j = 5.9; 
	           float k = 4.4; 
	           System.out.println( j + k ); */    
			
	//Documentation comments
			/** 
			 * <h2> Calculation of numbers </h2> 
			 * This program implements an application 
			 * to perform operation such as addition of numbers  
			 * and print the result  
			 * <p> 
			 * <b>Note:</b> Comments make the code readable and  
			 * easy to understand. 
			 *  
			 * @author Aman 
			 * @since 2023-02-09 
			 */  
			 /** 
		     * This method calculates the summation of two integers. 
		     * @param input1 This is the first parameter to sum() method 
		     * @param input2 This is the second parameter to the sum() method. 
		     * @return int This returns the addition of input1 and input2 
		     */  
		    public int sum(int input1, int input2){  
		        return input1 + input2;  
		    }  
		    /** 
		    * This is the main method uses of sum() method. 
		    * @param args Unused 
		    * @see IOException  
		    */    
	public static void main(String[] args) {
		//single line comment
		System.out.println(i);//printing the value of int varible i
		
		//Multiple line comments
		System.out.println(q);
		
		//Documentation comments
		Question3 obj = new Question3();  
        int result = obj.sum(40, 20);  
  
      
        System.out.println("Addition of numbers: " + result);  
	}

}
