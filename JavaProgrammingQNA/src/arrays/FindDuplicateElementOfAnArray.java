package arrays;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateElementOfAnArray {

	public static void main(String[] args) {
//		we can use any data type of duplicacy
//		We can store it in a map bcz map store only unique key
//		String sr[]= {"kk","ll","gg","kk","cc","ll","ll"};
		int sr[]= {4,3,3,2,1,1,1};
//		Map<String, Integer> map=new HashMap<String, Integer>();
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
//		iterate through for loop
//		for (String i : sr) {
		for (int i : sr) {
//			get all the element value of the Array
			System.out.println("i : "+i);
//			Get the count(Value) of the element(Key)
			Integer count=map.get(i);
//			initially its value is "null" because there is no value until we put a value 
			System.out.println("count : "+count);
			if (count==null) {
//				we put the value(1) and key for the first time  
				System.out.println("contains value : "+map.get(i));
				map.put(i, 1);
				System.out.println("contains value : "+map.get(i));
			}else {
//				if the key is already present then we increase the value(count) by 1
				map.put(i, ++count);
			}
		}
//		print the map
		System.out.println(map);
//		Print only which key(element) those have 2 or more value (repeated element)
//		iterate over map
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue()>1) {
				System.out.println(entry.getKey()+"="+entry.getValue());
			}
		}
		
	}

}
