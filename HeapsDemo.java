/**
  Mohammed Raza
  CSC 236 - Lab6 #2(main)
*/

import java.util.*;

public class HeapsDemo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		BinaryTree tree = new BinarySearchTree();

		int input;

		int index;

		System.out.println("enter tree elements: ");

		for(int i = 0; i < 10; i++)
		{
			input = keyboard.nextIntbb();

			tree.insert(input);

		}

		System.out.println("original heap: ");
		tree.postorder();

		System.out.println("");

		tree.delete(10);
		tree.delete(9);
		tree.delete(8);

		System.out.println("result heap: ");
		tree.postorder();


	}
}
