class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int[] nums0 = new int[m+n];

        if(n == 0){
            return;
        }
        int k = 0;
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                nums0[k] = nums1[i];
                i++;
                k++;
            }else{
                nums0[k] = nums2[j];
                k++;
                j++;
            }
        }
        
        for(int l = k; l < m+n; l++){
            if(i >= m){
                nums0[l] = nums2[j];
                j++;
            } else {
                nums0[l] = nums1[i];
                i++;
            }
        }
            
        for(int l = 0; l < m+n; l++){
            nums1[l] = nums0[l];
        }
        
        
    }
}
