package api;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest01 {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("조지 클루니");
		list.add("클루니");
		list.add("브래드피트");
		list.add("베컴");
		printStr(list);
		
	}

	private static void printStr(List list) {
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		
	}
}
