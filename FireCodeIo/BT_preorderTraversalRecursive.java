package FireCodeIo;

import java.util.ArrayList;

/**
 * Created by Ivan on 9/13/2017.
 */
public class BT_preorderTraversalRecursive {
    ArrayList<Integer> preorderedList = new ArrayList<Integer>();
    public void preorder(TreeNode root) {


        // Preorder: root -> left -> right
        if(root != null){
            preorderedList.add(root.data);

            if(root.left != null){
                preorder(root.left);
            } if (root.right != null){
                preorder(root.right);
            }
        }

    }
}
