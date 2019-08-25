class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        boolean found = false;
        for(int start = 0; start < gas.length; start++){
            int gasTank = 0;
            int station = start;
            while(true){
                gasTank = gasTank + gas[station];
                if(gasTank >= cost[station]){
                    gasTank = gasTank - cost[station];
                    station = (station+1)%gas.length;
                } else {
                    break;
                }
                if(station == start){
                    found = true;
                    break;
                }
            }
            if(found){
                return start;
            }
        }
        return -1;
    }
}
