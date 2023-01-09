import java.util.ArrayList;
import java.util.List;
 class TreeNode {
    int val;
    TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
       this.val = val;
        this.left = left;
          this.right = right;
         }
     }

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {

        //Create a list to store the data.
        List<Integer> list = new ArrayList<>();

        //if root is null, return the empty list.
        if(root == null) return list;

        //add the root data to list.
        list.add(root.val);

        //in preorder, left data is added after root, use recursion of access left data.
        //So that we does not need to check base conditions again.
        list.addAll(preorderTraversal(root.left));

        //now add the right data.
        list.addAll(preorderTraversal(root.right));

        //finally, return the list.
        return list;
        
    }
}