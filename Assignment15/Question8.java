package Assignment15;
import java.io.*;
public class Question8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
File file = new File("C:\\Users\\acer\\eclipse-workspace\\Java\\src\\Assignment15\\aman5.txt");
BufferedWriter obj = new BufferedWriter(new FileWriter(file));
obj.write("aman");
System.out.println("good work");
obj.close();
	}

}
