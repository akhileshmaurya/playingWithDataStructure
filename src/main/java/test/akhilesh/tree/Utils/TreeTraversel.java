package test.akhilesh.tree.Utils;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import test.akhilesh.tree.node.TreeNode;

public class TreeTraversel {

	public static <E> void preOrderTraversel(TreeNode<E> root) {
		System.out.println("preOrderTraversel  :");
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

	public static <E> void inOrderTraversel(TreeNode<E> root) {
		System.out.println("inOrderTraversel :");
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

	public static <E> void postOrderTraversel(TreeNode<E> root) {
		System.out.println("postOrderTraversel :");
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

	public static <E> void levelOrderTraversel(TreeNode<E> root) {
		System.out.println("levelOrderTraversel :");
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

	public static <E> void inorderTraverselWithoutRecursion(TreeNode<E> root) {
		System.out.println("inorderTraverselWithoutRecursion :");
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
	
	
	//For inorder traversal Adding all left node to stack
	private static <E> void pushAllLeftToStack(Stack<TreeNode<E>> stack, TreeNode<E> temp) {
		while (temp != null) {
			stack.push(temp);
			temp = temp.getLeftChild();
		}

	}

}
