package Big_or_Small;

public class Chip {
	private int chip_10;
	private int chip_1;
	
	public int getChip_10() {
		return this.chip_10;
	}
	
	public int getChip_1() {
		return this.chip_1;
	}
	
	public Chip() {
		this.chip_10 = 10;
		this.chip_1 = 1;
	}
	
	public int changeChip1_to_Chip10(int chip1_sum) {
		if(chip1_sum > 9  ) {
			chip1_sum = 0;
		}
		return this.chip_10;
	}
	
	
	
	
	
	
	
	
	

}
