package Assignment15;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
//import org.apache.commons.io.IOUtils;
public class Question1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
	FileInputStream input = new FileInputStream("C:\\Users\\acer\\eclipse-workspace\\Java\\src\\Assignment15\\aman.txt");
	int i = 0;
	while((i=input.read())!=-1){
	System.out.print((char)i);
	}
	input.close();

}catch(Exception e){
	System.out.println(e);
	
}
}


}
