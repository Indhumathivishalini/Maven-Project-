package stringlearning;

public class LearningStrings {
 public static void main(String[] args) {
	 
		String name="indhumathi";
		char[] charArray = name.toCharArray();
		for (char c : charArray) {
			System.out.print(c);
			
		}
		System.out.println();
		
		int length = charArray.length;
		System.out.println(length);
		for(int i=length-1; i>=0; i--) {
		System.out.print(charArray[i]);	
		}
		System.out.println();
		
		StringBuilder build = new StringBuilder("indhumathi");
		StringBuilder reverse = build.reverse();
		System.out.println(reverse);
	
		StringBuffer buffer = new StringBuffer("indhumathi");
		StringBuffer reverse1 = buffer.reverse();
		System.out.println(reverse1);
		
		
		
	}

}
