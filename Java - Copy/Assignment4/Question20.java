package Assignment4;

public class Question20 {
	static void printMissingElements(int arr[],
            int N)
{
		int diff = arr[0] - 0;
		for(int i=0;i<N;i++) {
			if(arr[i] - i != diff) {
				while(diff<arr[i] - i) {
				int ans = 	diff+i;
					System.out.print(ans+
" ");
					diff++;
				}
			}
		}
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,5,7,8,9,11,13,15,17,19,21,23,25,27,29,30};
		int N = arr.length;
		printMissingElements(arr,N);
		
		
		  
}
}