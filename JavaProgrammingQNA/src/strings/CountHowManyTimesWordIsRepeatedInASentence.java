package strings;

import java.util.HashMap;
import java.util.Map;

public class CountHowManyTimesWordIsRepeatedInASentence {

	public static void main(String[] args) {
		String input = "Java is great and Java is powerful and Java is everywhere";
		String[] sa=input.split(" ");
		System.out.println(sa[0]);
		Map<String, Integer> map=new HashMap<String, Integer>();
		for (String i : sa) {
			if (map.get(i)==null) {
				map.put(i, 1);
			}else {
				map.put(i, map.get(i)+1);
			}
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
