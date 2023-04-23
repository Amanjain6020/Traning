package Assignment14;
import java.io.*;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FileReader obj = new FileReader("file.txt");
BufferedReader br = new BufferedReader(obj);
String data = null;
while((data=br.readLine()) != null) {
	System.out.println(data);
}
br.close();
	}

}
