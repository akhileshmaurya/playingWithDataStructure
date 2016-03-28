package test.akhilesh.tree.Utils;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import test.akhilesh.tree.node.TreeNode;

public class TreeTraversel {

	public static <E> void preOrderTraversel(TreeNode<E> root) {
		if (root == null)
			return;

		System.out.print(root.getData() + "  ");
		preOrderTraversel(root.getLeftChild());
		preOrderTraversel(root.getRightChild());

	}

	public static <E> void inOrderTraversel(TreeNode<E> root) {
		if (root == null)
			return;
		inOrderTraversel(root.getLeftChild());
		System.out.print(root.getData() + "  ");
		inOrderTraversel(root.getRightChild());

	}

	public static <E> void postOrderTraversel(TreeNode<E> root) {
		if (root == null)
			return;
		postOrderTraversel(root.getLeftChild());
		postOrderTraversel(root.getRightChild());
		System.out.print(root.getData() + "  ");

	}

	public static <E> void levelOrderTraversel(TreeNode<E> root) {
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
		if (root == null)
			return;
		Stack<TreeNode<E>> stack = new Stack<TreeNode<E>>();
		TreeNode<E> temp = root;
		pushAllLeftToStack(stack, temp);
		while (!stack.isEmpty()) {
			temp=stack.pop();
			System.out.print(temp.getData()+"  ");
			if(temp.getRightChild()!=null){
				temp=temp.getRightChild();
				pushAllLeftToStack(stack, temp);
			}
		}
	}

	private static <E> void pushAllLeftToStack(Stack<TreeNode<E>> stack, TreeNode<E> temp) {
		while (temp != null) {
			stack.push(temp);
			temp = temp.getLeftChild();
		}

	}

}
