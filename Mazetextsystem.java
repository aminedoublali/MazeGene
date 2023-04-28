import java.util.*;

public class Mazetextsystem extends MakeMz {

  // Scannerをクラス化し別クラスでも呼び出せるようにした。
  public class Scannerclass {

    public static Scanner input_text = new Scanner(System.in);
  }

  static class Gametext {

    Scanner scanner = new Scanner(System.in);
    MakeMz mapdate = new MakeMz();

    public void gametextsystem() {
      // ゲームスタート
      String start = "それではゲームをスタートします";

      // ユーザー入力
      String input_user = scanner.nextLine();
      // ゲーム終了
      String finish = "ゲームを終了します";
      // ゲームオーバー
      String gameover = "GAMEOVER";

      if (input_user.equals("y")) {
        // 福田君頼んだ
        int[][] MazeMap = mapdate.getMaze();
        for (int[] i : MazeMap) {
          System.out.println(Arrays.toString(i));
        }
        System.out.println(start);
      } else {
        System.out.print(finish);
      }
    }

    public void gameClear(int tekazu) {
      System.out.println("_人人人_");
      System.out.println(">クリア<");
      System.out.println("-人人人-"); 
      System.put.println("クリアおめでとう！　ここまでにかかった手数は、" + tekazu + "手です。")///TODO: ゲームクリアおめでとう的なもの書く
      //もう一度遊ぶかどうか尋ねるテキスト (あれば)
    }
  }
}
