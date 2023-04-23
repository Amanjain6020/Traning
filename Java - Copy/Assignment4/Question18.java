package Assignment4;

public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,1,2,6,7,8};
		

		for(int i =0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if (arr[i] == arr[j]) {
				
				arr[j] = -1;
				
			}
			
			
		}
			
			
			}
		
		for(int j =0; j<arr.length;j++) {
			if(arr[j] != -1) {
				
				System.out.print(arr[j]);
			}
		}
	}

}
