package com.HashTable;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedHashMapTest {

	@Test
	public void givenAParagraphWhenWordsAreAddedShouldReturnParanoidFrequency() {
		String sentence = "Paranoids are not paranoid because they're paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap();
		String[] words = sentence.toLowerCase().split(" ");
		for (String i : words) {
			Integer value = myLinkedHashMap.get(i);
			if (value == null)
				value = 1;
			else
				value++;

			myLinkedHashMap.add(i, value);

		}

		int frequency = myLinkedHashMap.get("paranoid");
		System.out.println();
		System.out.println(myLinkedHashMap);
		Assert.assertEquals(3, frequency);

	}

	@Test
	public void givenAParagraphWhenWordIsRemovedShouldReturnSize() {
		String sentence = "Paranoids are not paranoid because they're paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap();
		String[] words = sentence.toLowerCase().split(" ");
		for (String i : words) {
			Integer value = myLinkedHashMap.get(i);
			if (value == null)
				value = 1;
			else
				value++;

			myLinkedHashMap.add(i, value);

		}
		System.out.println("Before Removing Avoidable:-");
		System.out.println(myLinkedHashMap);

		int frequency = myLinkedHashMap.remove("avoidable");

		System.out.println("After Removing Avoidable:-");
		System.out.println(myLinkedHashMap);
		Assert.assertEquals(1, frequency);

	}
	
}
