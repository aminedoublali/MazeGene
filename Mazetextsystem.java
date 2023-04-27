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
<<<<<<< HEAD
                
                // やりました → 福田君頼んだ
                int[][] MazeMap = mapdate.getMaze();
                for (int[] i: MazeMap){
=======

                // 福田君頼んだ
                String[][] MazeMap = mapdate.getMaze();
                for (String[] i : MazeMap) {
>>>>>>> d909009cfe8b2f3fbf0341369f21de4d9fbf4cce
                    System.out.println(Arrays.toString(i));
                }
                System.out.println(start);
            } else {
                System.out.print(finish);
            }
        }
    }

}
