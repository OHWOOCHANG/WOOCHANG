package api;

import java.util.HashMap;
import java.util.Map;

public class CollectionTest02 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("브레드피트", "010-1111-1111");
		map.put("조니뎁", "010-1111-2222");
		map.put("리처드기어", "010-1111-3333");
		map.put("최지웅", "010-1111-4444");
		map.put("디카프리오", "010-1111-5555");
		
//		System.out.println(map.get("최지웅"));
		
		for(String key:map.keySet()) {
			System.out.println(key);
		}
	}
}
