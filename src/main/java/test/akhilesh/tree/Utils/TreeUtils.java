package test.akhilesh.tree.Utils;

import java.util.LinkedList;
import java.util.Queue;

import test.akhilesh.tree.node.TreeNode;

public class TreeUtils {

	public static <E> TreeNode<E> makeTreeWithGivenArray(E[] input) {
		TreeNode<E> root = null;
		Queue<TreeNode<E>> queue = new LinkedList<TreeNode<E>>();
		for (int i = 0; i < input.length; i++) {
			root = insertElement(root, queue, input[i]);
		}
		return root;
	}

	private static <E> TreeNode<E> insertElement(TreeNode<E> root, Queue<TreeNode<E>> queue, E e) {
		TreeNode<E> newNode = new TreeNode<E>(e);
		if (root == null) {
			root = newNode;
		} else {
			TreeNode<E> frontNode = queue.peek();
			if (frontNode.getLeftChild() == null) {
				frontNode.setLeftChild(newNode);
			} else if (frontNode.getRightChild() == null) {
				frontNode.setRightChild(newNode);
			}
			if (frontNode.getLeftChild() != null && frontNode.getRightChild() != null)
				queue.poll();
		}
		queue.add(newNode);
		return root;
	}

	public static TreeNode<Integer> makeSampleBinaryTree() {
		Integer[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		return makeTreeWithGivenArray(input);
	}

	public static TreeNode<Integer> makeSampleBinaryTreeWIthSizeN(int n) {
		Integer[] input = new Integer[n];
		for (int i = 1; i <= n; i++) {
			input[i-1] = i;
		}
		return makeTreeWithGivenArray(input);
	}
}
