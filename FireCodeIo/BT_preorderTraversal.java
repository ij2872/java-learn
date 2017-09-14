package FireCodeIo;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Ivan on 9/13/2017.
 */
public class BT_preorderTraversal {
    public ArrayList<Integer> preorderItr(TreeNode root) {
        if(root == null) return new ArrayList();

        ArrayList<Integer> visited = new ArrayList();
        Stack<TreeNode> currentLevel = new Stack<>();
        currentLevel.push(root);

        //preorder //root -> left -> right
        // stacks, pop of from the top, therefore we push right first.
        while(!currentLevel.isEmpty()){
            TreeNode t = currentLevel.pop();
            visited.add(t.data);
            //right
            if(t.right != null){
                currentLevel.push(t.right);

            }
            // left
            if(t.left != null){
                currentLevel.push(t.left);

            }

        }

        return visited;
    }
}
