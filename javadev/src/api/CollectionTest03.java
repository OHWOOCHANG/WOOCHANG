package api;

import java.util.HashMap;
import java.util.Map;

public class CollectionTest03 {
	public static void main(String[] args) {
		Map<String, FriendVO> friendMap = new HashMap<String, FriendVO>();
		friendMap.put("최지웅A", new FriendVO("010-1111-1111", 27, 1));
		friendMap.put("최지웅B", new FriendVO("010-1111-1122", 23, 1));
		friendMap.put("장동건", new FriendVO("010-1111-1111", 47, 1));
		friendMap.put("배수지", new FriendVO("010-1111-1111", 22, 2));
		friendMap.put("전지현", new FriendVO("010-1111-1111", 39, 2));
		friendMap.put("송혜교", new FriendVO("010-1111-1111", 35, 2));
		friendMap.put("송중기", new FriendVO("010-1111-1111", 33, 1));
		
//		System.out.println(friendMap.get("송중기"));
		
		for(String key:friendMap.keySet()) {
			FriendVO friendVO = friendMap.get(key);
			System.out.println(key + " 의 전화번호는" + friendVO.getPhone());
			System.out.println(", 나이는" + friendVO.getAge() + "이며");
			System.out.println(friendVO.getGender());
		}
	}
}
