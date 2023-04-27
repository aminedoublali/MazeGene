import java.util.Scanner;

public class Mazetextsystem {
    // Scannerをクラス化し別クラスでも呼び出せるようにした。
    public class Scannerclass {
        public static Scanner input_text = new Scanner(System.in);
    }

    static class Gametext {
        Scanner scanner = new Scanner(System.in);

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
                System.out.println(start);
            } else {
                System.out.print(finish);
            }
        }
    }

}
