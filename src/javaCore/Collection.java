package javaCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;

public class Collection {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(-1);
		list.add(0);
		list.add(8);
		//list.addAll(Arrays.asList(3, 4));
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		//System.out.println(list.get(2));
		// map

//		Map<String, Integer> map = new LinkedHashMap<>();
//		map.put("hani", 1);
//		map.put("welela", 2);
//		map.put("mukur", 3);
//		System.out.println(map);
//		System.out.println(map.get("hani"));
//		map.remove("welela");
//		System.out.println(map);
//		//map.remove("welel");
//		System.out.println(map.containsKey("hanin"));
//		map.put("hani", 4);
//		System.out.println(map);
//		map.put("hani2", 6);
//		map.put("welela2", 7);
//		map.put("mukur2", 8);
//		System.out.println(map);
		//System.out.println(firstUniqueCharCheck("aabbccdefdf"));
		
	}

	public static Character firstUniqueCharCheck(String str) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (Character c : str.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, (map.get(c))+1);
			} else
				map.put(c, 1);
		}

		for(Map.Entry<Character, Integer> entry :map.entrySet()) {
			if(entry.getValue() == 1)
				return entry.getKey();
		}
		return null;
	}

}
