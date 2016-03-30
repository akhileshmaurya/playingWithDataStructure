package test.akhilesh.tree.Utils;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import test.akhilesh.tree.node.TreeNode;

public class TreeTraversal {

	public static <E> void preOrderTraversal(TreeNode<E> root) {
		System.out.println("preOrderTraversal  :");
		preOrderTraverse(root);
		System.out.println();
	}

	private static <E> void preOrderTraverse(TreeNode<E> root) {
		if (root == null)
			return;

		System.out.print(root.getData() + "  ");
		preOrderTraverse(root.getLeftChild());
		preOrderTraverse(root.getRightChild());

	}

	public static <E> void inOrderTraversal(TreeNode<E> root) {
		System.out.println("inOrderTraversal :");
		inOrderTraverse(root);
		System.out.println();

	}

	private static <E> void inOrderTraverse(TreeNode<E> root) {
		if (root == null)
			return;
		inOrderTraverse(root.getLeftChild());
		System.out.print(root.getData() + "  ");
		inOrderTraverse(root.getRightChild());

	}

	public static <E> void postOrderTraversal(TreeNode<E> root) {
		System.out.println("postOrderTraversal :");
		postOrderTraverse(root);
		System.out.println();

	}

	private static <E> void postOrderTraverse(TreeNode<E> root) {
		if (root == null)
			return;
		postOrderTraverse(root.getLeftChild());
		postOrderTraverse(root.getRightChild());
		System.out.print(root.getData() + "  ");

	}

	public static <E> void levelOrderTraversal(TreeNode<E> root) {
		System.out.println("levelOrderTraversal :");
		levelOrderTraverse(root);
		System.out.println();

	}

	private static <E> void levelOrderTraverse(TreeNode<E> root) {
		Queue<TreeNode<E>> queue = new LinkedList<TreeNode<E>>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode<E> temp = queue.poll();
			System.out.print(temp.getData() + "  ");
			if (temp.getLeftChild() != null)
				queue.add(temp.getLeftChild());
			if (temp.getRightChild() != null)
				queue.add(temp.getRightChild());
		}
	}

	public static <E> void inorderTraversalWithoutRecursion(TreeNode<E> root) {
		System.out.println("inorderTraversalWithoutRecursion :");
		if (root == null)
			return;
		Stack<TreeNode<E>> stack = new Stack<TreeNode<E>>();
		TreeNode<E> temp = root;
		pushAllLeftToStack(stack, temp);
		while (!stack.isEmpty()) {
			temp = stack.pop();
			System.out.print(temp.getData() + "  ");
			if (temp.getRightChild() != null) {
				temp = temp.getRightChild();
				pushAllLeftToStack(stack, temp);
			}
		}
		System.out.println();
	}

	// For inOrder traversal Adding all left node to stack
	private static <E> void pushAllLeftToStack(Stack<TreeNode<E>> stack, TreeNode<E> temp) {
		while (temp != null) {
			stack.push(temp);
			temp = temp.getLeftChild();
		}

	}

	public static <E> void traverseLikeAsTree(TreeNode<E> root) {
		int height = TreeUtils.getHeight(root);
		//todo: make a logic for traversing tree

	}

	private static void printSpaces(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(" ");
		}

	}
}
