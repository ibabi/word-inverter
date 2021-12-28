import java.util.Scanner;

public class WordInverter
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] word = text.toCharArray();
		
		for (int  i = word.length - 1; i >= 0; i--) {
		System.out.print(arr[i]);		
		}
	
	}
}