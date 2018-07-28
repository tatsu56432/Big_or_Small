package Big_or_Small;

import java.util.Scanner;

public class BigOrSmall{
	 
	public BigOrSmall() {

	}
	
	public void askBigOrSmall() {
		System.out.println("[Big or Small] 0:small 1:Big");
	}
	
	
	public boolean judgeBigOrSmall(int decideNum , int duelResult) {
			
		int inputNum = 0;
		Scanner scanner;
        scanner = new Scanner(System.in);
        inputNum = Integer.parseInt(scanner.nextLine());
        
        
		boolean result = false;
		if(decideNum == duelResult) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
	
	public boolean ask(int earnedChip , int decideNum) {
		boolean result = false;
		System.out.println("獲得したチップ" + earnedChip +"枚でゲームを続けますか？");
		
		if(decideNum == 1) {
			result = true;
		}else {
			result = false;
		}
		
		return result;
	}
	
	public boolean continueOrFinish(int inputNum) {
		boolean continueFlag = false;
		
		if(inputNum == 0) {
			continueFlag = true;
		}
		return continueFlag;
	}
	
}
