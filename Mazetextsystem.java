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

    public void gametextsystem() {
      if (input_user.equals("y")) {
        System.out.println("ゲームスタート！！");
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
}
