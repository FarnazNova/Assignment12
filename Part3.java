import java.util.Scanner;
import java.util.InputMismatchException;
public class Part3 {
	
	private static double sum = 0.0;
	public static double sum() 
	{
		Scanner scan = new Scanner(System.in);
		double value = 1.0;		
		do
		{
			System.out.println("Please enter a number:");	
			try {
			value = scan.nextDouble();
			sum += value;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Invalid, please enter a number.");
				scan.next();	
			}												
		}while(value !=0);

		System.out.print("The sum is " + sum);
		scan.close();
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		try 
		{						
			sum();				
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid, please enter a number.");
			scan.nextLine();	
		}
		
	}

}
