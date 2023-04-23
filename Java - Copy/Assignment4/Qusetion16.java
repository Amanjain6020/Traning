package Assignment4;
import java.util.Arrays;
import java.util.Collections;


public class Qusetion16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {15,2,3,4,5,6,7,8,9};
int mini=arr[0] ;
int maxi=arr[0];
for(int i=0;i<arr.length;i++) {
	if(arr[i]<mini) {
		mini = arr[i];
	}
	else if(arr[i] > maxi) {
		maxi = arr[i];
}
}
	int[] num = new int[2];
	arr[0] = mini;
	arr[1] =maxi;
	System.out.println("the difference between two grettest and samllest number");
	System.out.print(maxi-mini);
	}

}
