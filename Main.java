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
		BigOrSmall BorS = new BigOrSmall();

		t.shuffle();
		for (int i = 0; i < 52; i++) {
			System.out.println(t.cardsDeck.get(i));
			// t.cardsDeck.get(i);
		}

		System.out.println("＊＊＊＊＊チップ枚数とカード＊＊＊＊＊＊＊");

		p.display();
		c.display();

		boolean flag_continue = true;
		while (flag_continue) {
			Cards previous = t.cardsDeck.get(deal_num);
			System.out.println("現在のカード:" + previous);
			System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
			System.out.println("現在の総計は" + c.getTotalChip() + "です");
			System.out.println("BET枚数選択");
			System.out.println("BETするchip数を入力してください。(最大1〜20)");
			

			
			boolean scannerflag = false;
			while (!scannerflag) {
				try {
					int num = MyScanner.ChipLimitSizeScanner();
					System.out.println(num + "枚BET！！");
					c.betChip(num);
					System.out.println("現在のチップ数は" + c.getTotalChip() + "です");
					// ここまできたらflagをtrueに
					scannerflag = true;
				} catch (NumberFormatException e) {
					System.out.println("正の整数で入力してください。");
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
					// e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			// 
			Cards next = t.cardsDeck.get(++deal_num);
			int result;
			System.out.println(next);
			
			int bs = 0;
			try {
			    bs = MyScanner.BigOrSmallScanner();	
			}catch(Exception e) {
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}
			
			//System.out.println(bs);
			
			previous.setNum(1);
			next.setNum(1);
			System.out.println(previous);
			System.out.println(next);
			
			
			
			result = t.numDuel(previous, next);
			

			
			if( (result == 1 && bs == 0) || (result == 0 && bs == 1) ) {
				System.out.println("win!!!");
			}else{
				System.out.println("lose,,,");
			}
			
			System.out.println(bs);
			System.out.println(result);
			

			
			
				
				// ゲーム52回したら抜ける	
				if(deal_num > 52) {
					flag_continue = false;
//					t.shuffle();
					System.out.println("52回のデッキを使い果たしたのでゲームを終了します。");
				}
				// どこでユーザは続けるかどうか判断する？
				// 戻す処理のやり方、わからない
			
		} // while loop ここまで
	}
}
