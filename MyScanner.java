package Big_or_Small;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyScanner {
	
	public static int ChipScanner() {
		
		int result = 0;
		Scanner scanner;	
        scanner = new Scanner(System.in);
        result = Integer.parseInt(scanner.nextLine());
        
		return result;
		
	}

}
