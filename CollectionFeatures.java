/**
 * @author gaurnitai
 * @created_date Dec 11, 2017
 */

package com.javabasics.akash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

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
		


		// To sort the array in descending order
		System.out.println("Before sorting " + array);
		Collections.sort(array);
		Collections.reverse(array); 
		// ----or---
		Collections.sort(array,Collections.reverseOrder());
		System.out.println("After sorting " + array);
		
		
		
		HashSet<Integer> hs = new HashSet<Integer>();

		hs.add(123);
		hs.add(345);
		hs.add(123);
		hs.add(456);
		hs.add(3564);

		System.out.println("Before sorting " + hs);
		//Collections.sort(hs); // cannot sort Map with Collections.sort()
		System.out.println("After sorting " + hs);

		HashMap<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(123, "Rama");
		mp.put(124, "Krishna");
		mp.put(124, "John");
		mp.put(125, "John");

		System.out.println("Before sorting " + array);
		//Collections.sort(mp); // cannot sort Map with Collections.sort()
		System.out.println("After sorting " + array);

	}

}
