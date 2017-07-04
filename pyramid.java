import java.util.Scanner;
public class pyramid
{
public static void main(String args[])
{
	int row,c,n,temp;
	Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows");
        n =scan.nextInt();
		temp=n;
		for(row=1;row<=n;row++)
		{
			for(c=1;c<temp;c++)
			
				System.out.print(" ");
			
			temp--;
			for(c=1;c<=2*row-1;c++)
				System.out.print("*");
			
			System.out.println(" ");
		}
}
}

       
