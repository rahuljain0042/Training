
public class Stringbuilderdemo {

	public static void main(String[] args) {
	
		StringBuilder str = new StringBuilder("rahul");
	      System.out.println("string = " + str);
	    
	      
	      str.append("jain");
	      
	      
	      System.out.println("After append = " + str);

	      str = new StringBuilder("1234 ");
	      System.out.println("string = " + str);
	      
	     
	      str.append("!#$%");
	      
	     
	      System.out.println("After append = " + str);
	   }

	}


