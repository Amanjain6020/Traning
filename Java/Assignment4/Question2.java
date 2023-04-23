package Assignment4;

public class Question2 {
static double average(int a[], int n) {
	int sum =0;
	for(int i=0;i<n;i++)
		sum += a[i];
	return (double)sum/n;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,2,3,4,5};
int n = arr.length;
System.out.println(average(arr,n));
	}

}
