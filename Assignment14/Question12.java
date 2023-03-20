package Assignment14;
import java.io.FileReader;
import java.util.*;
public class Question12 {

	public static void main(String[] args)

{
		FileReader obj = new FileReader("file.txt");		
		System.out.println(obj.read());
		obj.close();
	}

}
