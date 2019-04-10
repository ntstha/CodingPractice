/**
Given a string and a number of lines k, print the string in zigzag form. In zigzag, characters are printed out diagonally from top left to bottom right until reaching the kth line, then back up to top right, and so on.

For example, given the sentence "thisisazigzag" and k = 4, you should print:

t     a     g
 h   s z   a
  i i   i z
   s     g
**/

public class Main {
    
    public static void printZigZag(String s,int k){
        if(s==null || s.length()==0){
            return;
        }
        
        int c_sp=0; 
        int level=k; 
        for(int i=0;i<k;i++){
            if(i>=s.length()){
                continue;
            }
            boolean isDown = true;
            for(int sp=0;sp<c_sp;sp++){
                System.out.print(" ");
            }
            
            System.out.print(s.charAt(i));
            
            int next_char = i+2*level-2;
            
            if(level==1){
                next_char = next_char+2*(1+k-level)-2;
            }
            int prev_char=i;
            while(next_char<s.length()){
                for(int sp=0;sp<next_char-prev_char-1;sp++){ 
                    System.out.print(" ");
                }
                
                System.out.print(s.charAt(next_char));
                
                prev_char = next_char;
                
                if(isDown){
                    if(level!=k){
                        isDown=false;
                    }
                }else{
                    isDown = true;
                }
                if(isDown){
                    next_char = next_char+2*level-2;
                }else{
                    next_char = next_char+2*(1+k-level)-2;
                }
            }
            
            System.out.print("\n");
            c_sp=c_sp+1;
            level = level-1;
        }
    }
    
    
    public static void main(String[] args) {
        printZigZag("Thisisazigzag",4);
    }
}
