package com.java.bst;

public class Runne {
	public static void main(String[] args) {
		BinarySearchTree tree=new BinarySearchTree();
		tree.addElem(144);
		tree.addElem(111);
		tree.addElem(101);
		tree.addElem(155);
		tree.addElem(160);
		tree.preOrderTraverseal(tree.rootNode);
//		System.out.println(tree.rootNode.left.left.key);
		
	}
}
