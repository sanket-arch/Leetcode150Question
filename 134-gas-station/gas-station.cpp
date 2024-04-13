class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int n=gas.size();
        int total_gas_cost=0;
        int tank_gas=0;
        int start=0;

        for(int i=0;i<n;i++){
            total_gas_cost+=gas[i]-cost[i];
            tank_gas+=gas[i]-cost[i];
            if(tank_gas<0){
                tank_gas=0;
                start=i+1;
            }
        }

        if(total_gas_cost<0)
            return -1;
        
        return start;
    }
};