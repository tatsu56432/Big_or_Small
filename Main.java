package Big_or_Small;

import java.util.Scanner;

public class Main {

	private static Scanner scanner;
	public static int betChip;

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// Cards c = new Cards();
		// c.display();

		int deal_num = 0;
		Point p = new Point();
		Chip c = new Chip(9, 10);
		TrampCards t = new TrampCards();
		BigOrSmall b = new BigOrSmall();

		
		

		t.shuffle();
		for (int i = 0; i < 52; i++) {
        System.out.println(t.cardsDeck.get(i));
//			t.cardsDeck.get(i);
		}

		
		
		
		System.out.println("＊＊＊＊＊チップ枚数とカード＊＊＊＊＊＊＊");
		
		p.display();
		c.display();
		
		
		
		boolean flag_continue = true; 
		while(flag_continue) {
			Cards previous = t.cardsDeck.get(deal_num);
			System.out.println("現在のカード:" + previous);
			System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
			System.out.println("BET枚数選択");
			System.out.println("BETするchip数を入力してください。(最大1〜20)");
			System.out.println("現在の総計は" + c.getTotalChip() + "です");
	
			boolean flag = false;
			try {
				int num = MyScanner.ChipLimitSizeScanner();
				System.out.println(num + "枚BET！！");
				try {
					c.betChip(num);
					System.out.println("現在のチップ数は" + c.getTotalChip() + "です");
					//ここまできたらflagをtrueに
					 flag = true;
				} catch (Exception e) {
					e.printStackTrace();
				}
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
			}
	
			
			//flagがtrueなら勝負開始
			if(flag) {				
			    Cards next = t.cardsDeck.get(++deal_num);
				int result;
	            System.out.println(next);
				result = t.numDuel(previous, next);
				if (result == 2) {
					
					result = t.markDuel(t.cardsDeck.get(0), t.cardsDeck.get(1));
					if (result == 1) {
						System.out.println("勝ち");	
					} else {
						System.out.println("負け");
					}
				} else if (result == 1) {
					System.out.println("勝ち");
					
				} else 	{
					System.out.println("負け");
				}	
			}//勝負終了
			
			//ゲーム52回したら抜ける
			if(deal_num > 52) {
				flag_continue = false;
				t.shuffle();
				//どこでユーザは続けるかどうか判断する？
				//game続行するかのscannerを作成するってことですか？
				//
				//コインが少ない場合？
				//scannerが判定してます
				//できてないです
				//戻す処理のやり方、わからない
//				if() {
                //ありがとうございますー！！！！１！！！
//				//ここでゲーム抜ける	
//				}
			}
		}//while loop ここまで
	}
}
