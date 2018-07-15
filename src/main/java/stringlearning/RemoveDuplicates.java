package stringlearning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
	public static void main(String[] args) {

		String companyname = "google"; 
		Set<Character> uniquechar = new HashSet<Character>();
		char[] charArray = companyname.toCharArray();
		for (char c : charArray) {
			uniquechar.add(c);
		}
		System.out.println(uniquechar);
		
		Set<Character> uniquechar1 = new TreeSet<Character>();
		char[] charArray1 = companyname.toCharArray();
		for (char c : charArray1) {
			uniquechar1.add(c);
		}
		System.out.println(uniquechar1);
		
		
		Set<Character> uniquechar2 = new LinkedHashSet<Character>();
		char[] charArray2 = companyname.toCharArray();
		for (char c : charArray2) {
			uniquechar2.add(c);
		}
		System.out.println(uniquechar2);
		
		
		
		List<Character> list = new ArrayList<Character>();
		char[] charArray3 = companyname.toCharArray();
		for (char c : charArray3) {
			if(!list.contains(c)) {
				list.add(c);
			}
			
		}
		System.out.println(list); 
	}
}