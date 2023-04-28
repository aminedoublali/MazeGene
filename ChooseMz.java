import java.util.*;

public class ChooseMz  {
  String[][] maze;
  int[] start;
  int[] goal;

  public void choose(){
    System.out.println("難易度を選んでください。");
    System.out.println("初級:1, 中級:2, 上級:3");

    MakeMz MakeMz = new MakeMz(); 
    Scanner scanner = new Scanner(System.in);
    Integer level = scanner.nextInt();// ユーザに数値入力させて迷路選ばせる

    if (level == 1) {// 初級を選択した場合
      this.maze = MakeMz.getMaze();// メソッドlevel1の迷路を呼び出す
      this.start = MakeMz.getStart();
      this.goal = MakeMz.getGoal();

    } else if (level == 2) {// 中級を選択した場合
      this.maze = MakeMz.getMazesecond();// メソッドlevel2の迷路を呼び出す
      this.start = MakeMz.getStartsecond();
      this.goal = MakeMz.getGoalsecond();

    } else if (level == 3) {// 上級を選択した場合
      this.maze = MakeMz.getMazethrd();// メソッドlevel3の迷路を呼び出す
      this.start = MakeMz.getStartthrd();
      this.goal = MakeMz.getGoalthrd();
    } else {// それ以外の入力の場合
      choose();
    }
  }

  public String[][] getMaze() {
    return maze;
  }
  public int[] getStart() {
    return start;
  }

  public int[] getGoal() {
    return goal;
  }


}



