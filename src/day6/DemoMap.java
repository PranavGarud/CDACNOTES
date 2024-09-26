package day6;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DemoMap {
	
	public static void main(String[] arga) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("one",100);
		map.put("two",200);
		map.put("three",300);
		map.put("four",400);
		System.out.println(map);
		System.out.println("--------------------------------------------------");
		
		
		map.remove("three");
		map.put("one", 7000);
		System.out.println(map);
		System.out.println("--------------------------------------------------");
		
		
		int val = map.get("four");
		System.out.println(val);
		System.out.println("--------------------------------------------------");
	
		
		Set<String> keys = map.keySet();
		for(String key : keys)
		{
			System.out.println(key+"-"+map.get(key));
		}
		System.out.println("--------------------------------------------------");
		
		Set<Entry<String,Integer>> entries = map.entrySet();
		for(Entry entry : entries)
		{
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		
	}

}
