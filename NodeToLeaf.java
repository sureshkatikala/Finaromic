package interview;

import java.util.ArrayList;

public class NodeToLeaf 
{
	 class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) {
		       val = x;
		       left=null;
		       right=null;
		      }
		  }
	 
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) 
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        if(root == null)
            return null;
        // temp.add(root.val);
        pathSum(root, sum, result, temp);
        return result;
        
    }
    public void pathSum(TreeNode node, int sum, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> temp) {
        if(node == null)
            return;
        int currentVal = node.val;
        temp.add(currentVal);
        if(node.left == null && node.right == null){
            if(sum - currentVal == 0){
                result.add(new ArrayList<Integer>(temp));
            }
        }
        pathSum(node.left, sum - node.val, result, temp);
        pathSum(node.right, sum - node.val, result, temp);
        temp.remove(temp.size() - 1);
        
    }

}
