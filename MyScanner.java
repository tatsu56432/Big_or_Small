package Big_or_Small;

import java.util.Scanner;

public class MyScanner {
	
	public static int ChipScanner() throws Exception {
		
		int result = 0;
		Scanner scanner;	
        scanner = new Scanner(System.in);
        result = Integer.parseInt(scanner.nextLine());
		return result;
		
	}
	
	public static int ChipLimitSizeScanner() throws Exception{
		
		int num;
		Scanner scanner;	
        scanner = new Scanner(System.in);
        num = Integer.parseInt(scanner.nextLine());
        if(num > 20 || num < 1) {
        	throw new IllegalArgumentException("BETできる枚数は1枚から20枚までです。");
        	//errMassage = "BETできる枚数は1枚から20枚までです。";
        }
		return num;
	}
	
	
	
	
//	public static String ChipLimitPointScanner(int totalPoint) throws Exception{
//		String errMassage = "";
//		int num;
//		Scanner scanner;
//		
//        scanner = new Scanner(System.in);
//        num = Integer.parseInt(scanner.nextLine());
//        
//        if(num > totalPoint) {
//        	errMassage = "BETするチップポイントは総計のチップポイント以下で入力してください";
//        }
//		return errMassage;
//	}
}
