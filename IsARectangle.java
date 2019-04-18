/**
Find if there is a rectangle in binary matrix with corners as 1
There is a given binary matrix, we need to find if there exists any rectangle or square in the given matrix whose all four corners are equal to 1.

Examples:

Input :
mat[][] = { 1 0 0 1 0
            0 0 1 0 1
            0 0 0 1 0
            1 0 1 0 1}
Output : Yes
as there exists-
1 0 1
0 1 0
1 0 1

**/

public class Main {
    
    public static boolean isRectangle(int[][] arg){
        boolean result= false;
        int m = arg.length; //row
        int n = arg[0].length; //col
        Set<String> map = new HashSet<String>();
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arg[i][j]==1){
                    for(int k=j+1;k<n;k++){
                        if(arg[i][k]==1){
                            String key = String.valueOf(j).concat("-"+String.valueOf(k));
                            if(map.contains(key)){
                                return true;
                            }
                            map.add(key);
                        }
                    }
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                                    {1,0,0,1,0},
                                    {0,0,1,0,1},
                                    {0,0,0,1,0},
                                    {1,0,1,0,1}
                                };
        System.out.println(isRectangle(arr));
    }
}
