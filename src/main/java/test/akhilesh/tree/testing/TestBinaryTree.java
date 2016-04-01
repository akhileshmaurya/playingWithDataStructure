package test.akhilesh.tree.testing;

import test.akhilesh.tree.Utils.TreeTraversal;
import test.akhilesh.tree.Utils.TreeUtils;
import test.akhilesh.tree.node.TreeNode;

public class TestBinaryTree {

	public static void main(String[] args) {
		TreeNode<Integer> root = TreeUtils.makeSampleBinaryTreeWIthSizeN(20);
		TreeTraversal.inOrderTraversal(root);
		TreeTraversal.preOrderTraversal(root);
		/*TreeTraversal.postOrderTraversal(root);
		TreeTraversal.levelOrderTraversal(root);
		TreeTraversal.inorderTraversalWithoutRecursion(root);*/
	}

}
