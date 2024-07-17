class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumgas=0,sumcost=0;
        int start=0;
        int current=0;
        for(int i=0;i<gas.length;i++){
            sumgas+=gas[i];
        }
           for(int i=0;i<gas.length;i++){
            sumcost+=cost[i];
        }
    if(sumgas<sumcost) return -1;

    for(int i=0;i<gas.length;i++){
     current+=gas[i]-cost[i];
     if(current<0){
        start=i+1;
        current=0;
     }
    }
     return start;
    }
}