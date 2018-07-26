package Big_or_Small;

public class BigOrSmall{
	 
	public BigOrSmall() {

	}
	
	
	
	public void display(int earnedChip) {
		System.out.println("獲得したチップ" + earnedChip +"枚でゲームを続けますか？");
	}
	
	public boolean continueOrFinish(int inputNum) {
		
		boolean continueFlag = false;
		
		if(inputNum == 0) {
			continueFlag = true;
		}
		
		return continueFlag;
		
	}
	
}
