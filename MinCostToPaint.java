/**
This problem was asked by Facebook.

A builder is looking to build a row of N houses that can be of K different colors. He has a goal of minimizing cost while ensuring that no two neighboring houses are of the same color.

Given an N by K matrix where the nth row and kth column represents the cost to build the nth house with kth color, return the minimum cost which achieves this goal.

**/

/** O(nk) **/
Time complexity: 
 public int minCost(int[][] costs) {
        if(costs==null || costs.length==0){
            return 0;
        }
        
        int cost = 0;
        int prev_g=-1; //cannot happen
        
        for(int i=0;i<costs.length;i++){
            int min=-1;
            int prev=-1;
            for(int j=0;j<costs[0].length;j++){
               if(j==prev_g){
                   continue;
               }
                
               if(costs[i][j]<min || min==-1){
                   //will happend atleast once
                   min = costs[i][j];
                   prev = j;
               }
            }
            prev_g = prev;
            cost = cost+min;
           
        }
        return cost;
    }
