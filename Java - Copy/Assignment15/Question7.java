package Assignment15;
import java.io.*;
public class Question7 {

	public static void main(String[] args) 
	throws Exception{
		File file = new File("C:\\Users\\acer\\eclipse-workspace\\Java\\src\\Assignment15\\aman4.txt");
		// TODO Auto-generated method stub
BufferedReader obj = new BufferedReader(new FileReader(file));
String st;
while((st = obj.readLine())!=null)
	System.out.println(st);

	}

}
