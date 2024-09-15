package SORTING_ALGORITHM;

public class Insertion {

	public static void main(String[] args) {
	 // we shift we do not swap , we start from the arr[1] assuming arr[0] is already sorted, two loops 1 for numbers of passes and the other to shift the keys
		
		int arr []= {5,2,5,6,7,6};
		
		for(int i=1; i<arr.length;i++) {
			int key = arr[i];
			int j= i-1;
			
		    while(arr[j]>key && j>=0  ) {
			   
			   arr[j+1]= arr[j];
			   j-- ;
		   }
		  arr[j+1]=key ;
			
		}
		for (int num : arr ){
			System.out.print(num);
		}
	}

}
