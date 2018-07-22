package Big_or_Small;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
//		Cards c = new Cards();
//		c.display();
		
		Point p = new Point();
		Chip c = new Chip();
		TrampCards t = new TrampCards();
		
		
		for(int i=0;i<52;i++) {
			System.out.println(t.cardsDeck.get(i));	
		}
		
		System.out.print("＊＊＊＊＊チップ枚数とカード＊＊＊＊＊＊＊");
		p.display();
		c.display();
		System.out.println("現在のカード:" + t.cardsDeck.get(0));
		System.out.print("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
		
		System.out.print("BET枚数選択");
		System.out.print("BETするchip数を入力してください。(最大1〜20)");
		
		t.shuffle();
		int result;
		result = t.numDuel(t.cardsDeck.get(0), t.cardsDeck.get(1));
		if(result == 2) {
			result = t.markDuel(t.cardsDeck.get(0), t.cardsDeck.get(1));
			if(result == 1) {
				System.out.println("勝ち");	
			}else {
				System.out.println("負け");	
			}
		}else if(result == 1){
			System.out.println("勝ち");
		}else {
			System.out.println("負け");
		}
		
		
		
		
		
		
//		for(int i=0; i<Deck.size(); i++) {
//			result = Deck.get(i);		
//		}
		
		
//		int[] card_num = c.getCard_num();
//		
//		for (int num : card_num) {
//		    System.out.println(num);
//		}
		
//		int i;
//		for(i=0;i< card_num.length; i++) {
//			System.out.println(card_num[i]);
//		}
		
	}

}
