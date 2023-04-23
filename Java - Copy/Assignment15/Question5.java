package Assignment15;
import java.io.*;
public class Question5 {

	public static void main(String[] args) 
	throws Exception{
		// TODO Auto-generated method stub
FileReader obj = new FileReader("C:\\Users\\acer\\eclipse-workspace\\Java\\src\\Assignment15\\aman3.txt");
int i;
while((i=obj.read())!=-1) 
	System.out.print((char)i);

obj.close();
	}

}
