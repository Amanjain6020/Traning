package Assignment4;
import java.util.Arrays;
public class Question5 {
	
	public static void main(String[] args) {
		int k=0;
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
int[] num = new int[arr.length - 1];
int index = 3;
for(int i=0;i<arr.length;i++) {
	if(i == index) {
		continue;
	}
	num[k++] = arr[i];
	
}

	System.out.println("Resultant Array: "
            + Arrays.toString(num));


}

} 
