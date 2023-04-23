package Assignment15;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Question2 {

	public static void main(String[] args) {
		try {
			FileOutputStream input = new FileOutputStream("C:\\Users\\acer\\eclipse-workspace\\Java\\src\\Assignment15\\aman1.txt");
			String s = "welcome";
			byte b[] = s.getBytes();
			input.write(b);
			input.close();
			System.out.println("success..");

		}catch(Exception e){
			System.out.println(e);
			
		}
	}

}
