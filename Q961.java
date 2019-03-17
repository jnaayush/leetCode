class Solution {
    public int repeatedNTimes(int[] A) {
        Set<Integer> elements = new HashSet<>();
        for(int i = 0; i < A.length; i++){
            if(elements.contains(A[i])){
                return A[i];
            }
            else{
                elements.add(A[i]);
            }
        }
        return 0;
    }
}
