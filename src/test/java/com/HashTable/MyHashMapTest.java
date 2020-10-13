package com.HashTable;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class MyHashMapTest {
	
	@Test
	public void givenASentenceWhenWordsAreAddedShouldReturnWordFrequency() {
		String sentence = "To be or not to be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap();
		String[] words = sentence.toLowerCase().split(" ");
		for (String i : words) {
			Integer value = myHashMap.get(i);
			if (value == null)
				value = 1;
			else
				value = value + 1;

			myHashMap.add(i, value);

		}

		int frequency = myHashMap.get("to");
		Assert.assertEquals(2, frequency);

	}


}