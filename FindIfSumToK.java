/*Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
Bonus: Can you do this in one pass? */

public boolean find(int[] num,int k){
        Set<Integer> elem = new HashSet<Integer>();
        for(int i=0;i<num.length;i++){
            int toFind = k-num[i];
            if(elem.size()==0){
                elem.add(toFind);
            }else{
                if(elem.contains(num[i])){
                    return true;
                }else{
                    elem.add(toFind);
                }
            }
        }
     return false;
  }
     

/*
Space complexity: Creating hashmap takes O(n) space.

Time complexity: We parse through the array once, so it takes O(n) time.

*/
