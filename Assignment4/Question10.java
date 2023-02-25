package Assignment4;
import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,1,2,3,4,5};
		System.out.println("dupilicate element in given array are: ");
		// TODO Auto-generated method stub
		for(int i =0; i<arr.length; i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}


