import java.util.*;

public class Mazetextsystem extends MakeMz {

  // Scannerをクラス化し別クラスでも呼び出せるようにした。
  public class Scannerclass {

    public static Scanner input_text = new Scanner(System.in);
  }

  static class Gametext {

    Scanner scanner = new Scanner(System.in);
    MakeMz mapdate = new MakeMz();

    public String start;
    public String input_user = scanner.nextLine();
    public String finish; // TODO:finishの中身
    public String gameover;

    public void Text(String start, String input_user, String finish, String gameover) {
            // ゲームスタート
            this.start = "それではゲームをスタートします";
            // ユーザー入力
            this.input_user = scanner.nextLine();
            // ゲームオーバー
            this.gameover = "GAMEOVER";
    }


    public void gametextsystem() {
      if (input_user.equals("y")) {
        // ↓ whileループ内で描画しているため
        // // 描画処理呼び出し
        // for (String[] i : MazeMap) {
        // System.out.println(Arrays.toString(i));
        // }
        System.out.println(start);
      } else {
        System.out.print(finish);
      }
    }

    public void gameClear(int tekazu) {
      System.out.println("_人人人_");
      System.out.println(">クリア<");
      System.out.println("-人人人-");
      System.out.println("クリアおめでとう！ ここまでにかかった手数は、" + tekazu + "手です。");/// TODO: ゲームクリアおめでとう的なもの書く
      // もう一度遊ぶかどうか尋ねるテキスト (あれば)
    }
  }
}}
