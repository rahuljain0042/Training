public class odd
{
public static void main(String[] args) {
               
                
int limit;
               
System.out.println("Printing Odd numbers between 1 and " + args[0]);
limit = Integer.parseInt(args[0]);              
for(int i=1; i <= limit; i++){
                       
                       
if( i % 2 != 0){
System.out.print(i + " ");
}
}
}
}
