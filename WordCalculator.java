import java.net.URL;
import java.util.Scanner;
import java.net.MalformedURLException;
import java.io.IOException;
import java.lang.String;

public class WordCalculator {

	public static void main(String[] args) {
		try
		{
			URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
			int countWords = 0;
			Scanner input = new Scanner(url.openStream());
			while(input.hasNext())
			{
				String line = input.next();
				String[] words = line.split("\\s");				
				countWords += words.length;
				
			}
			System.out.println("There are " + countWords + " words in  President Abraham Lincoln’s Gettysburg from http://cs.armstrong.edu/liang/data/Lincoln.txt URL.");
		}
		catch(MalformedURLException ex)
		{
			System.out.println("Invalid URL");
		}
		catch(IOException ex)
		{
			System.out.println("I/O Errors: no such file");
		}

	}

}
