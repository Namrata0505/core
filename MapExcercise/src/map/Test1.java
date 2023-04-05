package map;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Hello");
		map.put(2,"Hii");
		map.put(null, null);
		map.put(8, "Neha");
		map.put(4, "Namrata");
		map.put(3, "Dave");
		map.put(7, "Jimit");
		map.put(6, "Jishan");
		map.put(5, "");
		System.out.println(map);
		System.out.println(map.get(1));
		System.out.println(map.size());
		System.out.println(map.remove(null));
		System.out.println(map.size());
		System.out.println(map.entrySet());
	}
}
