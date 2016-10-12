/**
  Mohammed Raza
  CSC 236 - Lab6 #2(class2)
*/

public abstract class BinaryTree
{
	private TreeNode root;

	public BinaryTree()
	{
		root = null;
	}

	public TreeNode getRoot()
	{
		return root;
	}

	public void setRoot(TreeNode theNewNode)
	{
		root = theNewNode;
	}

	public boolean isEmpty()
	{
		return root == null;
	}

	public abstract void insert(Comparable item);

	public abstract TreeNode delete(Comparable key);


	public void preorder()
	{
		doPreorder(getRoot());
	}

	private void doPreorder(TreeNode t)
	{
		if(t != null)
		{
			System.out.print(t.getValue()); System.out.print(" ");
			doPreorder(t.getLeft()); System.out.print(" ");
			doPreorder(t.getRight()); System.out.print(" ");
		}
	}


	public void inorder()
	{
		doInorder(getRoot());
	}

	private void doInorder(TreeNode t)
	{
		if(t != null)
		{
			doInorder(t.getLeft()); System.out.print(" ");
			System.out.print(t.getValue()); System.out.println(" ");
			doInorder(t.getRight()); System.out.println("");
		}
	}


	public void postorder()
	{
		doPostorder(getRoot());
	}

	private void doPostorder(TreeNode t)
	{
		if(t != null)
		{
			doPostorder(t.getLeft()); System.out.print(" ");
			doPostorder(t.getRight()); System.out.print(" ");
			System.out.print(t.getValue()); System.out.print(" ");
		}
	}


	public void order()
	{
		doOrder(getRoot());
	}

	private void doOrder(TreeNode t)
	{
		if(t != null)
		{
			doOrder(t.getRight()); System.out.print(" ");
			System.out.print(t.getValue()); System.out.print(" ");
			doOrder(t.getLeft()); System.out.print(" ");

		}
	}

}