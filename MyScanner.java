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
		
		int inputNum;
		Scanner scanner;	
        scanner = new Scanner(System.in);
        inputNum = Integer.parseInt(scanner.nextLine());
        if(inputNum > 20 || inputNum < 1) {
        	throw new IllegalArgumentException("BETできる枚数は1枚から20枚までです。");
        	//errMassage = "BETできる枚数は1枚から20枚までです。";
        }
		return inputNum;
	}
	
	public static int BigOrSmallScanner() throws Exception{
		
		int inputNum;
		Scanner scanner;	
        
        System.out.println("[Big or Small] 0:Big: 1:Small");
        System.out.println("BigOrSmall選択");
        
        scanner = new Scanner(System.in);
        inputNum = Integer.parseInt(scanner.nextLine());
        
        System.out.println(inputNum);
        
        if(inputNum < 0 || inputNum > 1) {
        	throw new IllegalArgumentException("範囲外の数値です"); 
        }
        
        return inputNum;
		
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
