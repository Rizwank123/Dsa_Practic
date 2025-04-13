package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,Integer>obj1=new HashMap<>();
		obj1.put('B',25);
		obj1.put('A',22);
		
		Map<Character,Integer>obj2=new HashMap<>();
		obj2.put('D', 90);
		obj2.put('E', 30);
		obj2.put('A', 10);
				
		Map<Character,Integer> finalMap=new HashMap<>();
		
		for(char a:obj1.keySet()) {
			finalMap.put(a, obj1.get(a));
		}
		for(char b: obj2.keySet()) {
			if(finalMap.containsKey(b)) {
				int a=obj2.get(b)+finalMap.get(b);
				finalMap.put(b, a);
			}
			else finalMap.put(b, obj2.get(b));
		}
		System.out.println(finalMap);

	}

}
//var aObj={"B":25,"A":22}
//
//var bObj={"D":90, "E":30, "A":10}

//Output should be like this {"A":32,"B":25,"D":90,"E":30}