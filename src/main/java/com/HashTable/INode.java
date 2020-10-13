package com.HashTable;

public interface INode<K> {
	K getKey();

	void setKey(K Key);

	INode getNext();

	void setNext(INode next);

}