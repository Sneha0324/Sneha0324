package list;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class collections {

	public static void main(String[] args) {
		List<Character> characters = List.of('A','Z','A','B','Z','F');
		
		Set<String> treeSet = new TreeSet(characters);
		System.out.println("TreeSet: "+treeSet);
		
		Set<String> linkedHashSet = new LinkedHashSet(characters);
		System.out.println("LinkedHashSet: "+linkedHashSet);
		
		Set<String> hashSet = new HashSet(characters);
		System.out.println("HashSet: "+hashSet);
	}
}
