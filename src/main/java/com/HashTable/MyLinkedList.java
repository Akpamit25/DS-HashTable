package com.HashTable;

public class MyLinkedList<K> {

	public INode<K> head;
	public INode<K> tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if (this.tail == null)
			this.tail = newNode;

		if (this.head == null)
			this.head = newNode;

		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);

		}

	}

	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		if (tempNode == tail)
			myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

	public void append(INode myNode) {
		if (this.tail == null)
			this.tail = myNode;

		if (this.head == null)
			this.head = myNode;

		else {
			this.tail.setNext(myNode);
			this.tail = myNode;

		}

	}

	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	public INode popLast() {
		INode tempNode = head;

		while (!(tempNode.getNext().equals(tail))) {
			tempNode = tempNode.getNext();
		}

		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
	}

	public INode searchNode(K key) {
		INode tempNode = this.head;
		while (tempNode != null) {
			if (tempNode.getKey().equals(key))
				return tempNode;
			tempNode = tempNode.getNext();
		}
		return null;
	}

	@Override
	public String toString() {
		return "MyLinkedListNodes { " + head + " } ";
	}

}