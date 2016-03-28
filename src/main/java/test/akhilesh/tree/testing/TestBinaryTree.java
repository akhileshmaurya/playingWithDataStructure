package test.akhilesh.tree.testing;

import test.akhilesh.tree.Utils.TreeTraversel;
import test.akhilesh.tree.Utils.TreeUtils;
import test.akhilesh.tree.node.TreeNode;

public class TestBinaryTree {

	public static void main(String[] args) {
		TreeNode<Integer> root = TreeUtils.makeSampleBinaryTreeWIthSizeN(5);
		TreeTraversel.inOrderTraversel(root);
		TreeTraversel.preOrderTraversel(root);
		TreeTraversel.postOrderTraversel(root);
		TreeTraversel.levelOrderTraversel(root);
		TreeTraversel.inorderTraverselWithoutRecursion(root);
	}

}
