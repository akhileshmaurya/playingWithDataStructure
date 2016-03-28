package test.akhilesh.tree.node;

public class TreeNode<E> {

	E data;
	TreeNode<E> leftChild;
	TreeNode<E> rightChild;

	public TreeNode(E data) {
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public TreeNode<E> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode<E> leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode<E> getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode<E> rightChild) {
		this.rightChild = rightChild;
	}

}
