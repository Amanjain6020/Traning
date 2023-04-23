package Assignment15;
import java.io.*;
public class Question6 {

	public static void main(String[] args) {
	try{
		// TODO Auto-generated method stub
FileWriter obj =new  FileWriter("C:\\Users\\acer\\eclipse-workspace\\Java\\src\\Assignment15\\aman4.txt");

System.out.println("success");
obj.write("welcome");
obj.close();
	}catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("wahhh!");
	}

}
