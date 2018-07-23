package Big_or_Small;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		
// TODO Auto-generated method stub	
//Cards c = new Cards();
//c.display();
		
		Point p = new Point();
		Chip c = new Chip(9,10);
		TrampCards t = new TrampCards();
		BigOrSmall b = new BigOrSmall();
		
		for(int i=0;i<52;i++) {
			System.out.println(t.cardsDeck.get(i));	
		}
		
		System.out.println("＊＊＊＊＊チップ枚数とカード＊＊＊＊＊＊＊");
		p.display();
		c.display();
		System.out.println("現在のカード:" + t.cardsDeck.get(0));
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
		
		System.out.println("BET枚数選択");
		System.out.println("BETするchip数を入力してください。(最大1〜20)");
		System.out.println(c.getTotalChip());
				
		try {
			c.betChip(5);
			System.out.println(c.getTotalChip());
		}catch(Exception e) {
			e.getMessage();
		}

		
//		try {
//		int ca = MyScanner.ChipScanner();
//		System.out.println(ca);
//        } catch (Exception e) {
//        e.printStackTrace();
//        }
		
//		try {
//		int num = MyScanner.ChipLimitSizeScanner();
//		System.out.println(num);
//        } catch (IllegalArgumentException e) {
//        	System.out.println(e.getMessage());
//        } catch(Exception e) {
//        	e.printStackTrace();
//        }
		
//		try {
//		String errMassage = MyScanner.ChipLimitPointScanner(p.getTotalPoint());
//		System.out.println(errMassage);
//        } catch (Exception e) {
//        e.printStackTrace();
//        }
        
//		t.shuffle();
//		int result;
//		result = t.numDuel(t.cardsDeck.get(0), t.cardsDeck.get(1));		
//		if(result == 2) {
//			result = t.markDuel(t.cardsDeck.get(0), t.cardsDeck.get(1));
//			if(result == 1) {
//				System.out.println("勝ち");	
//			}else {
//				System.out.println("負け");	
//			}
//		}else if(result == 1){
//			System.out.println("勝ち");
//		}else {
//			System.out.println("負け");
//		}
		
	}
}
