class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] arr = new int[amount+1];
        Arrays.fill(arr, Integer.MAX_VALUE-1);
        arr[0] = 0;
        for(int i=1; i <= amount; i++){
             for(int coin : coins){
                 if(i-coin>=0){
                    arr[i] = Math.min(arr[i],arr[i-coin]+1);
                 }
             }   
        }
        if(arr[amount] == Integer.MAX_VALUE-1){
            return -1;
        } else {
            return arr[amount];
        }
    }
}
