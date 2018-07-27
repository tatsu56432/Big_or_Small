package Big_or_Small;

public class BigOrSmall{
	 
	public BigOrSmall() {

	}
	
	
	
	public boolean judgeBigOrSmall(int decideNum,int duelResult) {
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
