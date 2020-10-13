package com.HashTable;

import java.util.ArrayList;

public class MyLinkedHashMap<K, V> {

	private final int buckets;
	ArrayList<MyLinkedList<K>> bucketList;

	public MyLinkedHashMap() {
		this.buckets = 10;
		this.bucketList = new ArrayList<MyLinkedList<K>>(buckets);
		for (int i = 0; i < buckets; i++) {
			this.bucketList.add(null);
		}
	}

	public V get(K key) {
		int index = this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList = this.bucketList.get(index);
		if (myLinkedList == null)
			return null;
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.searchNode(key);

		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	private int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % buckets;
		System.out.println("Key: " + key + " hashCode: " + hashCode + " index: " + index);
		return index;
	}

	public void add(K key, V value) {

		int index = this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList = this.bucketList.get(index);
		if (myLinkedList == null) {
			myLinkedList = new MyLinkedList<>();
			this.bucketList.set(index, myLinkedList);
		}
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.searchNode(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			myLinkedList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}

	}

	@Override
	public String toString() {
		return "MyLinkedHashMap List{" + bucketList + "}";
	}

}
