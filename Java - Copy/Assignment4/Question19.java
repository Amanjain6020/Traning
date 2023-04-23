package Assignment4;

public class Question19 {
static int arr[] = {3,4,5,6,7};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
find();
	}
	public static void find() {
		for(int i=0;i<arr.length;i++) 
			System.out.println(arr[i]);
		
		int i=0;
		for(int j=0; j<=100;j++) {
			if(j<arr.length && j==arr[i])
			i++;
		else 
			System.out.print(j+" ");
		}
	}
}
