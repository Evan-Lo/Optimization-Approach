package BinanyTree;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class BinaryTreeMethod {

	BinaryTreeNode root;

	private static int i = 0;
	private static ArrayList list = new ArrayList();

	public void addRoot(int theElement,int[] theElement2) {
		this.root = new BinaryTreeNode(theElement,theElement2);
	}

	public void addNode(BinaryTreeNode theNode, int theElement,int[] theElement2) {
		if (Double.parseDouble(theNode.element.toString()) > theElement) {
			if (theNode.leftChild == null) {
				theNode.leftChild = new BinaryTreeNode(theElement,theElement2);
			} else {
				addNode(theNode.leftChild, theElement,theElement2);
			}

		} else {
			if (theNode.rightChild == null) {
				theNode.rightChild = new BinaryTreeNode(theElement,theElement2);
			} else {
				addNode(theNode.rightChild, theElement,theElement2);
			}

		}

	}

	public void preOrder(BinaryTreeNode t) {
		if (t != null) {
			visit(t);
			preOrder(t.leftChild);
			preOrder(t.rightChild);
		}
	}

	public void inOrder(BinaryTreeNode t) {
		if (t != null) {
			preOrder(t.leftChild);
			visit(t);
			preOrder(t.rightChild);
		}
	}

	public void postOrder(BinaryTreeNode t) {
		if (t != null) {
			preOrder(t.leftChild);
			preOrder(t.rightChild);
			visit(t);

		}
	}

	public void BFS(BinaryTreeNode t) {

		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();

		q.offer(t);
		while (q.size()>0) {
			if (q.peek().leftChild != null) {
				q.offer(q.peek().leftChild);
			}
			if (q.peek().rightChild != null) {
				q.offer(q.peek().rightChild);
			}
			visit(q.poll());
		}

	}

	public void DFS(BinaryTreeNode t) {
		
		Stack<BinaryTreeNode> s = new Stack <BinaryTreeNode>();

		s.push(t);
		while (s.size()>0) {
			
			BinaryTreeNode temp;
			temp=s.peek();
			visit(s.pop());
			if (temp.leftChild != null) {
				s.push(temp.leftChild);
			}
			if (temp.rightChild != null) {
				s.push(temp.rightChild);
			}
			
		}
	}

	public void visit(BinaryTreeNode t) {

		System.out.println(t.element.toString() + ";");
		
		for(int i = 0;i<t.element2.length;i++)
		{  
			System.out.print(t.element2[i] + ";");
		}
		
	}
}
