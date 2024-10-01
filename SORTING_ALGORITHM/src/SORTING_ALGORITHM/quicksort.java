package SORTING_ALGORITHM;

public class quicksort {
	
	public static void quickSort(int arr [], int low, int high) {
		if (low< high) {
			
			// understand from here
			int pi = partition(arr,low, high);
			
		
			quickSort(arr, low, pi-1);
			quickSort(arr,pi+1 , high);
		}
		
	}

	private static int partition(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		
		int pivot =arr[high];
		 int i= low-1;
		 
		 for (int j = low; j < high; j++) {
			
		    if (arr[j] < pivot) {
		    	
		    	i++;
		    	
		    	int temp =arr[i];
		    	arr[i]= arr[j];
		    	arr[j]=temp;
		    }
			 
			 
		}

	    	int temp =arr[i+1];
	    	arr[i+1]= arr[high];
	    	arr[high]=temp;
		
		
		return i+1;
	}

	public static void main(String[] args) {
	 // we shift we do not swap , we start from the arr[1] assuming arr[0] is already sorted, two loops 1 for numbers of passes and the other to shift the keys
		
		int arr []= {5,2,5,6,7,6};
		
		
		
		
		
		
		quickSort(arr, 0  , arr.length-1 );
		
		for (int num : arr ){
			System.out.print(num);
		}
	}


}
