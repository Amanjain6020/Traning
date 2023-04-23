package Assignment4;

import java.util.Arrays;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,2,3,4,5,6,7};
int[] num = new int[arr.length + 1];
int x = 5;
int pos=3;
for(int i=0; i<arr.length+1; i++) {
	if(i<pos) 
		num[i]=arr[i];
	else if(i==pos) 
		num[i]=x;
	else
		num[i] = arr[i-1];
}
System.out.println("Resultant Array: "
        + Arrays.toString(num));
	}

}
