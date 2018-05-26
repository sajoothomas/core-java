package com.test.datastruc;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void testAddNode() {

		BinaryTree tree = new BinaryTree();
		
		tree.addNode(50);
		tree.addNode(25);
		tree.addNode(75);
		tree.addNode(10);
		tree.addNode(20);
		tree.addNode(5);
		tree.display(tree.head);
	}

}
