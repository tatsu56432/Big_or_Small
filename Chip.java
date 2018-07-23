package Big_or_Small;

public class Chip implements Game{
	private int chip_10;
	private int chip_1;
	private int totalChip;
	
	public int getChip_10() {
		return this.chip_10;
	}
	
	public int getChip_1() {
		return this.chip_1;
	}
	
	public int getTotalChip() {
		return totalChip;
	}
	
	public Chip(int chip_10 , int chip_1) {
		this.chip_10 = chip_10;
		this.chip_1 = chip_1;
		this.totalChip = chip_10 * 10 + chip_1 * 1;
	}
	
	public int changeChip1_to_Chip10(int chip1_sum) {
		if(chip1_sum > 9  ) {
			chip1_sum = 0;
		}
		return this.chip_10;
	}
	
	public void betChip(int chipNum) throws Exception {
		
		if(this.totalChip < chipNum) {
			throw new Exception("チップ枚数が足りません！");
		}
		
		this.totalChip -= chipNum;
		
	}
	
	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("現在[10点チップ]" + this.chip_10 + "枚保有、[1点チップ]" + this.chip_1 + "枚保有しています");
	}
	
	@Override
	public boolean decide() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
	
	
	
	

}
