// main

import java.util.*;

public class HeapsDemo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		BinaryTree tree = new BinarySearchTree();

		String input;

		int index;

		System.out.println("enter tree elements: ");

		for(int i = 0; i < 10; i++)
		{
			input = keyboard.next();

			tree.insert(input);

		}

		System.out.println("original tree: ");
		tree.preorder();

		System.out.println("");

		System.out.println("swapped subtrees: ");
		tree.order();

		// tree.swapSubtrees(TreeNode tree);
		// Dr. Zale, I was not able to pass tree object to
		// swapSubtrees method in BinaryTree class.




	}
}
