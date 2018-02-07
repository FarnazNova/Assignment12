import java.util.Scanner;
public class Part1 {
	
	public static void main(String[] args) {
		double sum =0.0;
		double value = 0.0;
		Scanner scan = new Scanner(System.in);
		do
		{
		System.out.println("Please enter a number:");
		value = scan.nextDouble();
		sum += value;		
		}while(value != 0);
		
		System.out.print("The sum is " + sum);
	}

}
