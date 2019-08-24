class Solution {
    public List<List<Integer>> subsets(int[] nums) {    
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        getListOfN(nums,new ArrayList<Integer>(),res,0,n);
        return res;
    }
    
    public void getListOfN(int[] nums,List<Integer> lst,List<List<Integer>> res, int l,int r){
        res.add(new ArrayList<>(lst));
        for(int j = l; j < r; j++){
            lst.add(nums[j]);
            getListOfN(nums,lst,res,j+1,r);
            lst.remove(lst.size()-1);
        }
    }
}
