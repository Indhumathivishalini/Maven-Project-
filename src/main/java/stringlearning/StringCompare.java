package stringlearning;

public class StringCompare {


	public static void main(String[] args) {
		String cmp = "Amazon";
		
		int hashCode = cmp.hashCode();
		System.out.println(cmp.hashCode());
		String cmp1 = "Amazon";
		int hashCode2 = cmp1.hashCode();
		System.out.println(cmp.hashCode());
		if(cmp == cmp1)
		
			System.out.println("both objects values are same");
		else
			System.out.println("both objects values are different");
	}

}
