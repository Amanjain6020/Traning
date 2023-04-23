package Assignment4;

import java.util.Arrays;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,2,3,4,5};
int[] num = new int[arr.length];
for(int i=0; i<arr.length; i++) {
	num[i]=arr[i];
}
System.out.println(Arrays.toString(arr));
System.out.println(Arrays.toString(num));
	}

}
