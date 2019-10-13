package com.java.bst;

public class BinarySearchTree {
	Node rootNode;
	public void addElem(int key)
	{
		if(rootNode==null)
		{
			Node newNode=new Node();
			newNode.key=key;
			newNode.right=null;
			newNode.left=null;
			rootNode=newNode;
		}
		else
		{
			addElem1(rootNode,key);
		}
	}
	
	public void addElem1(Node rootNode,int key)
	{
		if(key<rootNode.key && rootNode.left!=null)
		{
			addElem1(rootNode.left,key);
		}
		else if(key<rootNode.key && rootNode.left==null)
		{
			Node newNode=new Node();
			newNode.key=key;
			rootNode.left=newNode;
		}
		else if(key>rootNode.key && rootNode.right!=null)
		{
			addElem1(rootNode.right, key);
		}
		else if(key>rootNode.key && rootNode.right==null)
		{
			Node newNode=new Node();
			newNode.key=key;
			rootNode.right=newNode;
		}
		
	}
	public void inOrderTraverseal(Node rootNode)
	{
		if(rootNode==null)
		{
			return;
		}
		else
		{
			inOrderTraverseal(rootNode.left);
			System.out.println(rootNode.key);
			inOrderTraverseal(rootNode.right);
			
			
		}
	}
	public void postOrderTraverseal(Node rootNode)
	{
		if(rootNode==null)
		{
			return;
		}
		else
		{
			inOrderTraverseal(rootNode.left);
			
			inOrderTraverseal(rootNode.right);
			System.out.println(rootNode.key);
			
			
		}
	}
	
	public void preOrderTraverseal(Node rootNode)
	{
		if(rootNode==null)
		{
			return;
		}
		else
		{
			System.out.println(rootNode.key);
			inOrderTraverseal(rootNode.left);
			inOrderTraverseal(rootNode.right);
			
			
		}
	}
	

}
