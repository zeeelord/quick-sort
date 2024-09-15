package SORTING_ALGORITHM;// Correct version of the code

public class Selection_sort {
    public static void main(String[] args) {
        
        int nums[] = {6, 5, 2, 8, 9, 4};
        int size =nums.length;
        int temp = 0;
        int minIndex=-1;
        
        System.out.println("BEFORE SORTING"); 
        for (int num : nums) {
            System.out.print(num + " ");
        }
         System.out.println("");
         
         
        for (int i = 0; i < size-1; i++) {
			minIndex=i;
        	for (int j = i+1; j < size; j++) {
				 System.out.println("i= "+nums[minIndex]);
        		if(nums[minIndex]> nums[j]) {
        			minIndex=j;
        			 System.out.println("i= "+nums[minIndex]);
//        			System.out.print("i is"+ nums[i]+" j is " + nums[minIndex]);
//        			System.out.println();
        	
        		}
//        		for (int num : nums) {
//                    System.out.print(num + "");
//                }
//        		System.out.println(" ");
//        		
//        		System.out.println(" i is "+ nums[i]);
		     }
        	
//        	temp = nums[minIndex];
//    		nums[minIndex]= nums[i];
//    		nums[i]= temp;
        	temp = nums[i];
        	nums[i]=nums[minIndex];
        	nums[minIndex]=temp;
    		for (int num : nums) {
    	        System.out.print(num + " ");
    	        }
    		System.out.println("");
		}
        System.out.println("AFTER SORTING"); 
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

        
    }
}
// sometimes the line of the code might have disturbing indentation