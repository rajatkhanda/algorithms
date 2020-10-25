package com.rajat.algorithms.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeTraversals {

	// In order traversal of binary tree

	public static void travarseInOrderBinaryTree(Node root) {

		if (root == null)
			return;
		travarseInOrderBinaryTree(root.left);
		System.out.println(root.val);
		travarseInOrderBinaryTree(root.right);
	}

	// level order traversal of binary tree

	public static void levelOrderTraversal(Node root) {

		if (root == null)
			return;

		Queue<Node> queue = new ArrayDeque<Node>();
		queue.add(root);
		while (queue.size() != 0) {
			Node element = queue.remove();
			System.out.println(element.val);
			if (element.left != null)
				queue.add(element.left);
			if (element.right != null)
				queue.add(element.right);
		}

	}

	static class Node {

		int val;
		Node left;
		Node right;

		public Node(int val) {

			this.val = val;
			this.left = null;
			this.right = null;

		}

	}

}
