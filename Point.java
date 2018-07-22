package Big_or_Small;



public class Point implements Game{
	
	int point;
	int totalPoint;
	
	public Point() {
		this.totalPoint = 100;	
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(this.totalPoint);
	}


	@Override
	public boolean decide() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
