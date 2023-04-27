
import java.util.Scanner;

public class PlMz {
	// マップ完成
	int x, y;
	int[][] Mz;

	// コマの移動入力の受付
	void ido(int x, int y, int[][] Mz) { // x, yは
		this.x = x;
		this.y = y;
		this.Mz = Mz;

		System.out.println("移動したい方向を入力");
		System.out.println("w:↑ d:→ s:↓ a");// 移動の入力はw,a,s,dで行う

		// 矢印キーの受け取り
		Scanner scanner = new Scanner(System.in);
		System.out.print("移動方向入力 ->");
		String n = scanner.nextLine();
		System.out.println(n);

		// 移動
		switch (n) {
			case "w":
				if (Mz[x][y + 1] != 1) {
					Mz[x][y] = 0;
					y++;
				}
				if (Mz[x][y + 1] == 1) {// 進めなかった場合
					System.out.println("進むことができません");
				}
				break;
			case "d":
				if (Mz[x + 1][y] != 1) {
					Mz[x][y] = 0;
					x++;
				}
				if (Mz[x + 1][y] == 1) {// 進めなかった場合
					System.out.println("進むことができません");
				}
				break;
			case "s":
				if (Mz[x][y - 1] != 1) {
					Mz[x][y] = 0;
					y--;
				}
				if (Mz[x][y - 1] == 1) {// 進めなかった場合
					System.out.println("進むことができません");
				}
				break;
			case "a":
				if (Mz[x - 1][y] != 1) {
					Mz[x][y] = 0;
					x--;
				}
				if (Mz[x - 1][y] == 1) {// 進めなかった場合
					System.out.println("進むことができません");
				}
				break;
			// TODO:リスト外に出てしまう可能性あり、修正必要
			default:
				System.out.println("入力内容が間違っています");
				break;
		}
		// 移動可能かどうかの判定
		// startの一つ外側も移動不可にしておく
	}
	// ゴール座標と一致したかどうかの判定
	void finish(int x, int y, int goalX, int goalY) {
		if (x == goalX && y == goalY) {
			System.out.println("ゴールしました");
		}
	}

	int[] getNewPl() {
		// NOTE: PLの新しい座標を返す
		int[] newPL = {y, x};
		return newPL;
	}

	int[][] getNewMazeMap(){
		// NOTE: 書き換えたマップ(二次元配列)を返す
		return Mz;
	}

}
