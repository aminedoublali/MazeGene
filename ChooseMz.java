import java.util.*;

public class ChooseMz {
  public static String[][] ChooseMz() {
    ChooseMz chooseMz = new ChooseMz();
    String[][] maze = chooseMz.ChooseMz();
    MakeMz MakeMz = new MakeMz();
    System.out.println("難易度を選んでください。");
    System.out.println("初級:1, 中級:2, 上級:3");
    Boolean flag = true;

    while (flag == true) {
      Scanner scanner = new Scanner(System.in);
      Integer level = scanner.nextInt();// ユーザに数値入力させて迷路選ばせる

      if (level == 1) {// 初級を選択した場合
        maze = MakeMz.getMaze();// メソッドlevel1の迷路を呼び出す
        flag = false;

      } else if (level == 2) {// 中級を選択した場合
        maze = MakeMz.getMazesecond();// メソッドlevel2の迷路を呼び出す
        flag = false;

      } else if (level == 3) {// 上級を選択した場合
        maze = MakeMz.getMazethrd();// メソッドlevel3の迷路を呼び出す
        flag = false;

      } else {// それ以外の入力の場合
        flag = true;
        continue;
      }

    }
    return maze;
  }
}
