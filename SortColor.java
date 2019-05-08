/**
Given an array of strictly the characters 'R', 'G', and 'B', segregate the values of the array so that all the Rs come first, 
the Gs come second, and the Bs come last. You can only swap elements of the array.

Do this in linear time and in-place.

For example, given the array ['G', 'B', 'R', 'R', 'B', 'R', 'G'], it should become ['R', 'R', 'R', 'G', 'G', 'B', 'B'].
**/

/**
Approach: Slight modification of Counting Sort

Time Complexity : O(n) where n is the number of elements in the input array
Space complexity : O(3) or O(1)

**/

public class Main {
    
    public static char[] sort(char[] A){
        int[] c = new int[3];
        for(int i=0;i<A.length;i++){
            char color = A[i];
            int cv = 0;
            if(color=='G'){
                cv =1;
            }
            if(color=='B'){
                cv = 2;
            }
            c[cv] = c[cv]+1;
        }
        
        int next=0;
        for(int i=0;i<c[0];i++){
            A[i]='R';
            next = i+1;
        }
        int g_index = next;
        for(int i=g_index;i<(g_index+c[1]);i++){
            A[i]='G';
            next = i+1;
        }
        int b_index = next;
        for(int i=b_index;i<b_index+c[2];i++){
            A[i] = 'B';
        }
        
        return A;
    }
    
    public static void main(String[] args) {
        char[] input = new char[]{'R','G','R','R','G','G','B','R','B'};
        char[] input1 = new char[]{};
        input1 = sort(input1);
        for(int i=0;i<input1.length;i++){
            System.out.print(input1[i]);
        }
    }
}
