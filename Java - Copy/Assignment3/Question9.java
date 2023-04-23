package Assignment3;
import java.io.*;
import java.util.Scanner;
public class Question9 {
	
	
		
		 
		    public static void main(String[] args)
		 
		    {
		 int n = 7,
		      i ,
		        count = 0;
		        i=1;
		        while(i<=n) {
		        	if(n%i == 0)
		        		count++;
		        i++;
		        	System.out.println(count);
		        }
		        System.out.println(count);
		        if(count == 2) {
		        	System.out.println("number is prime");
		        }else {
		        	System.out.println("number is not prime");
		        }
		    }
		}
	


