package strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInAString1 {
	public static void main(String[] args) {
		String s= "programming";
		char[] c=s.toCharArray();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for (Character i : c) {
			Integer count=map.get(i);
			if (count==null) {
				map.put(i, 1);
			}else {
				map.put(i, ++count);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
}
