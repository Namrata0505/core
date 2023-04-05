package com;

import java.util.HashMap;
import java.util.Map;

final class ImmutableClass {
final private String name;
final private String address;
final private Map< String, String> metamap;

public ImmutableClass(String name, String address, Map<String, String> metamap ) {
	this.name = name;
	this.address = address;
	
	Map<String, String> hmap= new HashMap<String, String>();
	for(Map.Entry<String, String> entry : metamap.entrySet()) {
		hmap.put(entry.getKey(), entry.getValue());
		}
	
	this.metamap = hmap;
	
}

public String getName() {
	return name;
}

public String getAddress() {
	return address;
}

public Map<String, String> getMetamap() {
	Map<String, String> hmap= new HashMap<String, String>();
	for(Map.Entry<String, String> entry : metamap.entrySet()) {
		hmap.put(entry.getKey(), entry.getValue());
		}
	return hmap;
}

	
}
