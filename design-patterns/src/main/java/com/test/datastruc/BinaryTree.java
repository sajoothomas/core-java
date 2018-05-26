package com.test.datastruc;

public class BinaryTree {

	public TreeNode head;

	public int addNode(int value) {

		TreeNode newNode = new TreeNode(value);

		if (head == null) {
			head = newNode;
		} else {

			TreeNode focus = head;
			while (true) {
				TreeNode parent = focus;
				if (value > focus.value) {
					focus = focus.right;

					if (focus == null) {
						parent.right = newNode;
						return newNode.value;
					}

				} else {
					focus = focus.left;

					if (focus == null) {
						parent.left = newNode;
						return newNode.value;
					}
				}

			}

		}

		return value;
	}

	public void display(TreeNode current) {

		if (current != null) {

			display(current.left);
			System.out.println(current);
			display(current.right);
		}

	}

}

class TreeNode {

	public int value;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TreeNode [value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}

}