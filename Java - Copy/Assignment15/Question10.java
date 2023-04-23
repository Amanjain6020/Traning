package Assignment15;
import java.util.*;  
import java.io.*;  
public class Question10 {

	public static void main(String[] args)
	throws Exception{
		// TODO Auto-generated method stub
		Properties p=System.getProperties();  
		Set set=p.entrySet();  
		  
		Iterator itr=set.iterator();  
		while(itr.hasNext()){  
		Map.Entry entry=(Map.Entry)itr.next();  
		System.out.println(entry.getKey()+" = "+entry.getValue());  
		}  
	}

}
