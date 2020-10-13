package com.HashTable;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedHashMapTest {

		@Test
		public void givenAParagraphWhenWordsAreAddedShouldReturnParanoidFrequency() {
			String sentence = "Paranoids are not paranoid because they're paranoid but because they keep putting themselves deliberately into paranoid situations";
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
			System.out.println(myLinkedHashMap);
			Assert.assertEquals(3, frequency);

		}
}