package com.rajat.algorithms.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

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
	
	public static void spiralTraversal(Node root){
		
		if(root == null) return;
		
		Stack<Node> left = new Stack<Node>();
		Stack<Node> right = new Stack<Node>();
		left.add(root);
		while(left.size() >0 || right.size()>0){
			
			while(left.size() >0){
				Node current = left.pop();
				System.out.print(current.val + "\t");
				if(current.left!=null)right.push(current.left);
				if(current.right!=null)right.push(current.right);
			}
			
			System.out.println("\n");
			
			while(right.size()>0){
				
				Node current = right.pop();
				System.out.println(current.val + "\t");
				if(current.right!=null)left.push(current.right);
				if(current.left!=null)left.push(current.left);
				
			}
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
