class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0){
            return intervals;
        }
        Arrays.sort(intervals, (i1,i2) -> Integer.compare(i1[0], i2[0]));
        List<int[]> resL = new ArrayList<>();
        int left = intervals[0][0];
        int right = intervals[0][1];
        
        for(int i = 1; i < intervals.length; i++){
            if(right >= intervals[i][0] || left >= intervals[i][0]){
                right = Math.max(intervals[i][1],right);
                left = Math.min(intervals[i][0],left);
            } else {
                
                resL.add(new int[]{left,right});
                left = intervals[i][0];
                right = intervals[i][1];
            }
        }
        resL.add(new int[]{left,right});
        int size = resL.size();
        int[][] res = new int[size][2];
        for(int i = 0; i < size; i++){
            res[i][0] = resL.get(i)[0];
            res[i][1] = resL.get(i)[1];   
        }
        return res;
    }
}
