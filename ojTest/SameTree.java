package ojTest;


/*
 * 递归思想，巧妙利用最后的return语句，可以让程序瞬间变的高大上
 * */

public class SameTree {
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
        {
            return true;
        }
        
        if(p==null && q!=null || p!=null && q==null)
        {
            return false;
        }
        
        return isSameTree(p.left,q.left) && (p.val == q.val) && isSameTree(p.right,q.right);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
