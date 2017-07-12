
public class TestRunTimeException {

	public static void main(String args[]) {
		 try {
			 doCalculation();
		 }catch (SmallArrayException e){
			 //System.out.println("Exception Thrown when calling doCalculation:"
			 // +e);
			 System.out.println(e.getMessage());
		 }
			 System.out.println("out of block");
	}
	public static void doCalculation() throws SmallArrayException{
		int a[] = new int[2];
		if(3>a.length)
			throw new SmallArrayException( "what the..");
		System.out.println("Acess element threee:" +a[3]);
		
	}
}
