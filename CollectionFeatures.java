/**
 * @author gaurnitai
 * @created_date Dec 11, 2017
 */

package com.javabasics.akash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

import org.apache.commons.collections4.CollectionUtils;

 

public class CollectionFeatures {

	public static void main(String[] args) {

		ArrayList<String> array = new ArrayList<String>();

		array.add("Rama");
		array.add("Sushant");
		array.add("Manish");
		array.add("Akash");
		array.add("Swapnil");

		// To sort the array in ascending order
		System.out.println("Before sorting " + array);
		Collections.sort(array);
		System.out.println("After sorting " + array);

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Rama");
		arr.add("Sushant");
		arr.add("Andy");
		arr.add("Akash");
		arr.add("John");

		// to validate wheather array contains all the object as we have arr
		System.out.println(array.containsAll(arr)); // this will be false since Andy and John not present in array
 
		
		// To compare matching values between two lists
		ArrayList<String> equalValue = new ArrayList<String>(); // this is the arraylist to store matching values
		for (String s1 : array) {
			for (String s2 : arr) {
				if (s1.equals(s2)) {
					equalValue.add(s1);
					break;
				}

			}

		}
		System.out.println(equalValue);
		
		//There is another way to compare two List using 
		//org.apache.commons.collections4.CollectionUtils library
		// Download commons-collections from apache latest jar to the project
		System.out.println(CollectionUtils.isEqualCollection(array, arr)); // to make sure whether lists are equal or not
		System.out.println(CollectionUtils.intersection(array, arr)); // to find the matching objects between 2 different lists
		System.out.println(CollectionUtils.disjunction(array, arr)); // to find the non matching objects between 2 different lists

		// To sort the array in descending order
		System.out.println("Before sorting " + array);
		Collections.sort(array);
		Collections.reverse(array);
		// ----or---
		Collections.sort(array, Collections.reverseOrder());
		System.out.println("After sorting " + array);

		HashSet<Integer> hs = new HashSet<Integer>();

		hs.add(123);
		hs.add(345);
		hs.add(123);
		hs.add(456);
		hs.add(3564);

		System.out.println("Before sorting " + hs);
		// Collections.sort(hs); // cannot sort Map with Collections.sort()
		System.out.println("After sorting " + hs);

		HashMap<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(123, "Rama");
		mp.put(124, "Krishna");
		mp.put(124, "John");
		mp.put(125, "John");

		System.out.println("Before sorting " + array);
		// Collections.sort(mp); // cannot sort Map with Collections.sort()
		System.out.println("After sorting " + array);

	}

}
