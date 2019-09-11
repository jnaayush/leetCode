class Solution {
    public String largestNumber(int[] nums) {
        String[] numStr = new String[nums.length];
        for(int i= 0; i < nums.length; i++){
            numStr[i] = Integer.toString(nums[i]);
        }
        
        Arrays.sort(numStr,new Comparator<String>(){
            public int compare(String a,String b){
                return (b+a).compareTo((a+b));
            }
        });
        if(numStr[0].equals("0")) return "0";
        String ret = "";
        for(String s : numStr){
            ret = ret + s;
        }
        return ret;
    }
}
