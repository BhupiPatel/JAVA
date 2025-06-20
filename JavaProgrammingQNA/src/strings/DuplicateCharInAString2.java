package strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInAString2 {

	public static void main(String[] args) {
		String s= "programming";
		char[] c=s.toCharArray();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for (char i : c) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			} else {
				map.put(i, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
