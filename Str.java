class Str
 {
  public static void main(String[] args) {
    
   
    String first = "Java";
    
    System.out.println(first); 
	System.out.println(first.toLowerCase());
	System.out.println(first.toUpperCase());
	System.out.println(first.charAt(2));
	System.out.println(first.isEmpty());
   
	String str=new String("Hello");
	str =str.concat("jack");
	 System.out.println(str);



	StringBuffer sb=new StringBuffer("Hello ");  
	sb.append("Java");
	System.out.println(sb);
	System.out.println(sb.toString().toLowerCase());
	System.out.println(sb.toString().toUpperCase());

	StringBuilder s=new StringBuilder("Hello ");  
	s.append("Java");
	System.out.println(s);
  }
}