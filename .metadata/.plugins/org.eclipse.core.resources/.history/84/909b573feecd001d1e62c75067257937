package com;

import java.util.HashMap;
import java.util.Map;

public class ImmutableTest {

	public static void main(String[] args) {
		Map<String, String> map= new HashMap<String, String>();
		map.put("1", "Hello");
		map.put("2", "My Name Is");
		map.put("3", "NAMRATA");
	ImmutableClass ic= new ImmutableClass("Neha", "Gurugram", map);
	System.out.println(ic.getName());
	System.out.println(ic.getAddress());
	System.out.println(ic.getMetamap());
	System.out.println();
	map.put("4","Dave");
	System.out.println(ic.getMetamap());
	
	}

}
