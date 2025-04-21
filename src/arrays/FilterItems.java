package arrays;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruit=Arrays.asList("apple","banana","orange","grapus");
		List<String> a=fruit.stream().filter(b->b.contains("ap")).collect(Collectors.toList());
		System.out.println(a);

	}

}
 