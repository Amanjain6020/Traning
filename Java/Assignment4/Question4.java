package Assignment4;
import java.util.Arrays;
import java.util.stream.IntStream;
public class Question4 {

	public static void main(String[] args) {
		int toCheckValue = 0;
		boolean test = false;
		// TODO Auto-generated method stub
int[] num = new int[3];
int arr[] = {1,2,3};
toCheckValue = 3;//specific value
for(int element : arr) {
if(element == toCheckValue) {
	test = true;
    break;
	
	}

}
System.out.println(test);
}
}
