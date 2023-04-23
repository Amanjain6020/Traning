package Assignment15;
import java.io.*;  
public class Question4 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		 
		    FileOutputStream fin=new FileOutputStream("C:\\Users\\acer\\eclipse-workspace\\Java\\src\\Assignment15\\aman3.txt");    
		    BufferedOutputStream bin=new BufferedOutputStream(fin);
		   String s = "Welcome";
		    byte b[] = s.getBytes();
		    bin.write(b);
		    bin.flush();
		    bin.close();    
		    fin.close();    
		      System.out.println("success");
		   
		  
	}

}
