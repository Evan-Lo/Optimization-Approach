
public class test {

	public static void main(String args[]) {
		int[] arr = {5,1,6,8,4,2,3,10 ,7,8,9,9,9,9,9,9,120};
		int[] arr2 = {0};
		BinaryTreeMethod a = new BinaryTreeMethod();
		a.addRoot(arr[0],arr2);
		for(int i=1;i<arr.length;i++)
		{
			a.addNode(a.root, arr[i],arr2);
		}
		
		a.BFS(a.root);
		System.out.println();
		a.DFS(a.root);
		System.out.println();
		a.preOrder(a.root);
		System.out.println();
		a.inOrder(a.root);
		System.out.println();
		a.postOrder(a.root);
	}

}
