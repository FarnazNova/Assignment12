import java.util.Scanner;
import java.util.InputMismatchException;
public class Part2 {
	
	public static void main(String[] args) {
		double sum = 0.0;
		double value = 1.0;
		Scanner scan = new Scanner(System.in);
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
			scan.nextLine().isEmpty();	
		}
		}while(value != 0);
		
		System.out.print("The sum is " + sum);
		scan.close();
	}

}
