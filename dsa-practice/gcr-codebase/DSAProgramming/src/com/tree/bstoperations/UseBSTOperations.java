package com.tree.bstoperations;

/*
 * Scenario: A student attendance system stores student roll numbers in a BST for efficient
searching. The current BST contains: 15, 10, 20, 8, 12, 17, 25.
15
/ \
10 20
/ \ / \
8 12 17 25
Questions: a) Show step-by-step how to delete node 10 from this BST (which has two
children). b) After deletion in part (a), insert roll number 14 into the modified tree. Show the
steps. c) A new student with roll number 9 joins. Show the insertion process. d) If you need to
find all students with roll numbers between 10 and 20, which traversal would be most efficient
and why? e) Calculate the time complexity for searching roll number 25 in both best-case and
worst-case scenarios.
Expected Analysis: Students should master BST operations, particularly deletion with two
children, and understand time complexity implications.

 */

public class UseBSTOperations {

	BSTNode root;

	// Step counter for time complexity calculation
	int steps = 0;

	// Insert a node into BST
	BSTNode insert(BSTNode root, int value) {

		// If tree is empty
		if (root == null) {
			return new BSTNode(value);
		}

		// If value is smaller then go left
		if (value < root.data) {
			root.left = insert(root.left, value);
		}
		// If value is greater then go right
		else if (value > root.data) {
			root.right = insert(root.right, value);
		}

		return root;
	}

	// Inorder traversal (Left > Root > Right)
	void inorder(BSTNode root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}

	// Find minimum value (used for deletion)
	int findMin(BSTNode root) {
		int min = root.data;
		while (root.left != null) {
			min = root.left.data;
			root = root.left;
		}
		return min;
	}

	// Delete a node from BST
	BSTNode delete(BSTNode root, int key) {

		if (root == null)
			return root;

		if (key < root.data) {
			root.left = delete(root.left, key);
		} else if (key > root.data) {
			root.right = delete(root.right, key);
		} else {

			// Case 1 & 2
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// Case 3: Two children
			root.data = findMin(root.right);
			root.right = delete(root.right, root.data);
		}

		return root;
	}

	// SEARCH with step counter
	boolean search(BSTNode root, int key) {

		// Each comparison counts as one step
		steps++;

		if (root == null)
			return false;

		if (key == root.data)
			return true;

		if (key < root.data)
			return search(root.left, key);
		else
			return search(root.right, key);
	}

	// Count total nodes (for worst case)
	int countNodes(BSTNode root) {
		if (root == null)
			return 0;
		return 1 + countNodes(root.left) + countNodes(root.right);
	}

	public static void main(String[] args) {

		UseBSTOperations bst = new UseBSTOperations();

		int[] values = { 15, 10, 20, 8, 12, 17, 25 };

		// Build initial BST
		for (int v : values) {
			bst.root = bst.insert(bst.root, v);
		}

		System.out.println("Initial BST (Inorder):");
		bst.inorder(bst.root);
		System.out.println("\n");

		//Delete 10
		System.out.println("(a) Deleting node 10...");
		bst.root = bst.delete(bst.root, 10);
		bst.inorder(bst.root);
		System.out.println("\n");

		//Insert 14
		System.out.println("(b) Inserting 14...");
		bst.root = bst.insert(bst.root, 14);
		bst.inorder(bst.root);
		System.out.println("\n");

		//Insert 9
		System.out.println("(c) Inserting 9...");
		bst.root = bst.insert(bst.root, 9);
		bst.inorder(bst.root);
		System.out.println("\n");

		//Range explanation
		System.out.println("(d) Roll numbers between 10 and 20:");
		System.out.println("Using inorder traversal (sorted order)");
		System.out.println("12 14 15 17 20\n");

		//Time Complexity calculation
		int searchKey = 25;
		bst.steps = 0;

		boolean found = bst.search(bst.root, searchKey);
		int totalNodes = bst.countNodes(bst.root);

		System.out.println("(e) Searching roll number: " + searchKey);
		System.out.println("Found: " + found);
		System.out.println("Actual comparisons during search: " + bst.steps);

		System.out.println("\nBest Case:");
		System.out.println("Comparisons = 1");
		System.out.println("Time Complexity = O(1)");

		System.out.println("\nWorst Case:");
		System.out.println("Comparisons = " + totalNodes);
		System.out.println("Time Complexity = O(n)");
	}
}
