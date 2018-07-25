package Big_or_Small;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TrampCards{

	List<Cards> cardsDeck = new ArrayList<Cards>();

	public TrampCards() {
		for(int i=0; i<4;i++) {
			for(int j= 1;j<= 13; j++) {
				cardsDeck.add(new Cards(Cards.marks[i],j));
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cardsDeck);	
	}
	
	public int numDuel(Cards c1, Cards c2) {
		
		int result = 0;
		
		if(c1.getNum() > c2.getNum()) {
			result = 1;	
		}else if(c1.getNum() < c2.getNum()) {
			result = 0;
		}else{
			result = 2;	
		}
		return result;
	}
	
	//
	public int markDuel(Cards c1,Cards c2) {
		
		int result = 0;
		
		String mark1 = c1.getMark();
		String mark2 = c2.getMark();
//		
		int markNum1 = 0;
		int markNum2 = 0;
		
		if(mark1 == "スペード") {
			markNum1 = 1;
		}else if(mark1 == "ハート") {
			markNum1 = 2;
		}else if(mark1 == "ダイヤ") {
			markNum1 = 3;
		}else {
			markNum1 = 4;
		}
		
		if(mark2 == "スペード") {
			markNum2 = 1;
		}else if(mark2 == "ハート") {
			markNum2 = 2;
		}else if(mark2 == "ダイヤ") {
			markNum2 = 3;
		}else {
			markNum2 = 4;
		}
		
		if(markNum1 > markNum2) {
			result = 1;
		}else {
			result = 0;
		}
		return result;
	}
}
