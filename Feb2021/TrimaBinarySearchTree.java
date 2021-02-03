package feb2021;

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
public class TrimaBinarySearchTree {

	
    public TreeNode trimBST(TreeNode root, int low, int high) {
    	 if(root==null){
             return null;
         }
             root.left = trimBST(root.left,low,high);
             root.right = trimBST(root.right,low,high);
         if(root.val>=low && root.val<=high){
             return root;
         }
         else if(root.val<low){
             return root.right;
         }
         else{
             return root.left;
         }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
