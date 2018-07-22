package Big_or_Small;

public class Cards{
	public static final String[] marks = {"スペード","ハート","ダイヤ","クラブ"};
	private String mark;
	private int num;

	
	public String getMark() {
		return this.mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Cards(String mark,int num) {
		this.mark = mark;
		this.num = num;
	}

	public String toString() {
		return this.mark + this.num; 
	}

}
