package Assignment15;
import java.io.*;
public class Question3 {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
FileInputStream file = new FileInputStream("C:\\Users\\acer\\eclipse-workspace\\Java\\src\\Assignment15\\aman2.txt");
BufferedInputStream bin = new BufferedInputStream(file);
int i;
while((i=bin.read())!=-1){
	System.out.print((char)i);
}
bin.close();
file.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
