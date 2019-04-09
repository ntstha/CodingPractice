/**
A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.

Given the root to a binary tree, count the number of unival subtrees.

For example, the following tree has 5 unival subtrees:

   0
  / \
 1   0
    / \
   1   0
  / \
 1   1
**/

public static int countUnival(TreeNode root){
        if(root==null){
            return 0;
        }
        int count =0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            boolean isLeft = true;
            boolean isRight = true;
            if(node.left!=null){
                if(node.left.val != node.val){
                    isLeft = false;
                }
                queue.add(node.left);
            }
            if(node.right!=null){
                if(node.right.val != node.val){
                    isRight = false;
                }
                queue.add(node.right);
            }
            
            if(isLeft && isRight){
                count = count+1;
            }
        }
        return count;
    }
