//ふじさき
import java.util.*;

public class PlMz {
	// マップ完成
	boolean flag; // ゲームクリア及びwhileループの処理の定義用
	int x, y, goalX, goalY;
	String[][] Mz;

	// コマの移動入力の受付
	/**
	 * 
	 */
	void ido() { // void ido はここから
		MakeMz make = new MakeMz();
		int[] PL = make.getStart();// 書記スタート設定
		int[] goal = make.getGoal(); // goal設定
		String[][] Mz = make.getMaze();// 迷路地図設定


		// 各種初期化
		this.x = PL[0];// 14
		this.y = PL[1];// 1
		this.Mz = Mz;
		this.goalX = goal[0];
		this.goalY = goal[1];



		// 矢印キーの受け取り

		// 移動
		// ゴールまでのループ処理完成
		// while ループ フラグでループ判断
		while (x != goalX || y != goalY) {

			// System.out.println("Mz[y][x]" + "|" + Mz[y][x]); //数値確認用

			// System.out.println("W"+ Mz[y-1][x]);//テスト用 消した
			// System.out.println("a"+ Mz[y][x-1]);
			// System.out.println("s"+ Mz[y+1][x]);
			// System.out.println("d"+ Mz[y][x+1]);

			// 地図の描画
			for (String[] i : Mz) {
				System.out.println(Arrays.toString(i));
			}

			// 移動処理
			System.out.println("移動したい方向を入力");
			System.out.println("w:↑ d:→ s:↓ a");// 移動の入力はw,a,s,dで行う
			Scanner sc = new Scanner(System.in);
			// NOTE: Scannerが閉じていない。ループ処理を行うため意図的なもの

			System.out.print("移動方向入力 ->");
			String n = sc.nextLine();


			// System.out.println("PL" + x +"/"+ y +":"+ "goal" + goalX + "/" + goalY);//テスト表示用
			// System.out.println("n" + n);

			// CHANGED:Sを着色して扱うために変数化した
			String s = "\u001b[00;35m" + "S " + "\u001b[00m";

			// 加算処理のミス y軸は上に行くほど+ではなく-

			//
			// NOTE: scannerで取得したものと文字列を直接==で確かめることはできない。equalsの仕様は各々要確認
			// 参考リンク https://teratail.com/questions/101761?sort=2
			if (n.equals("w")) {
				if (Mz[y - 1][x] != "[]") {
					Mz[y][x] = "  ";
					y--;
					Mz[y][x] = s;
				} else {// 進めなかった場合
					System.out.println("進むことができません");
				}
			} else if (n.equals("d")) {
				if (Mz[y][x + 1] != "[]") {
					Mz[y][x] = "  ";
					x++;
					Mz[y][x] = s;
				} else {// 進めなかった場合
					System.out.println("進むことができません");
				}
			} else if (n.equals("s")) {
				if (Mz[y + 1][x] != "[]") {
					Mz[y][x] = "  ";
					y++;
					Mz[y][x] = s;
				} else {// 進めなかった場合
					System.out.println("進むことができません");
				}
			} else if (n.equals("a")) {
				if (Mz[y][x - 1] != "[]") {
					Mz[y][x] = "  ";
					x--;
					Mz[y][x] = s;

				} else {// 進めなかった場合
					System.out.println("進むことができません");
				}

			} else {
				System.out.println("入力内容が間違っています");

			}

		} // while ループ ここまで
		// 長すぎて見づらいので関数化してもいいかも


		// ここより下goal座標とPL座標が一致している
		// ゴールに到着している地図の描画
		for (String[] i : Mz) {
			System.out.println(Arrays.toString(i));
		}
	}// void ido はここまで



	int[] getNewPl() {
		// NOTE: PLの新しい座標を返す
		int[] newPL = {y, x};
		return newPL;
	}

	String[][] getNewMazeMap() {
		// NOTE: 書き換えたマップ(二次元配列)を返す
		return Mz;
	}

}
