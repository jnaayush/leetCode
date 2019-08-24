class Solution {
    public int findKthLargest(int[] nums, int k) {
        int index = nums.length - k;
        int pi = -1;
        int low = 0;
        int high = nums.length - 1;
        while(pi != index){
            pi = partition(nums,low,high);
            if(pi > index){
                high = pi-1;
            } else if (pi < index){
                low = pi+1;
            }
        }
        return nums[pi];
    }
    
    int partition(int arr[], int low, int high) 
      { 
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] <= pivot) 
            { 
                i++; 

                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 

        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
        return i+1; 
    } 
    
}
