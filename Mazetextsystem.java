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
        public String finish;
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

                // やりました → 福田君頼んだ
                String[][] MazeMap = mapdate.getMaze();
                for (String[] i : MazeMap) {
                    System.out.println(Arrays.toString(i));
                }
                System.out.println(start);
            } else {
                System.out.print(finish);
            }
        }
    }

}
