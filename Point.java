package Big_or_Small;



public class Point implements Game{
	
	int pointAmount;
	int totalPoint;
	
	public Point() {
		this.totalPoint = 100;	
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(this.totalPoint);
	}
	
	public int decreaseOrIncreasePoint(int duelResult) {
		
	if(duelResult == 1) {
		this.totalPoint += 10;
	}else {
		this.totalPoint -= 10;
	}
		return totalPoint;
	}


	@Override
	public boolean decide() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
