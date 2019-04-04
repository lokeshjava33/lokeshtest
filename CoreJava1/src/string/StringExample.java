package string;

public class StringExample {

	/**
	 * @param args
	 */
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s= "sachin";
		String s1= "Tendulkar";
		String s2= "sachin";
		String s3 = new String("sachin");
		
		//1)String are compared based on content and reference
		
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s==s3);
		
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		
		System.out.println(s.compareTo(s1));
		System.out.println(s1.compareTo(s2));

		s=s.concat(s1);
		System.out.println(s);
		
		/**
		 *2) String Concatenation
		 *2 way:
		 *1)By + operator
		 *2)By  concat()
		 */
		
		
		
		
	}

}
