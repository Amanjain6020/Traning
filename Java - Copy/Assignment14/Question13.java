package Assignment14;
import java.util.*;
public class Question13 {
public Object obj;
public static void main(String[] args) 
		throws ClassNotFoundException
{
	Class myClass = Class.forName("Question13");
		String feildname = "obj";
		System.out.println("this is my class feildname"+myClass.getField(feildname));
		 
	}

}
