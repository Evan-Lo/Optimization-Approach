import java.util.Arrays;

public class BinaryTreeNode {
	Object element;
	int[] element2;
	BinaryTreeNode leftChild;
	BinaryTreeNode rightChild;

	public BinaryTreeNode() {
	}

	public BinaryTreeNode(Object theElement,int[] theElement2) {
		element = theElement;
		element2= theElement2;
	}

	public BinaryTreeNode(Object theElement,BinaryTreeNode theleftChild,BinaryTreeNode therightChild)
	{
		element= theElement;
		leftChild=theleftChild;
		rightChild=therightChild;
	}

}
