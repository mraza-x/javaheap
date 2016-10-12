/**
  Mohammed Raza
  CSC 236 - Lab6 #2(class3)
*/

public class Heap extends BinaryTree
{
	public void insert(Comparable item)
	{
		setRoot(recurInsert(getRoot(),item));
	}

	private TreeNode recurInsert(TreeNode t, Comparable item)
	{
		if(t == null)
			return new TreeNode(item);
		else if(item.compareTo(t.getValue()) >= 0)
			t.setLeft(recurInsert(t.getLeft(), item));
		else
			t.setRight(recurInsert(t.getRight(),item));
		return t;
	}

	public TreeNode delete(Comparable key)
	{
		TreeNode p = getRoot();
		while(p != null && key.compareTo(p.getValue()) != 0)
		{
			if(key.compareTo(p.getValue()) > 0)
				p = null;
			else
				p = p.getRight();
		}

		return p;
	}


}


