import java.util.*;

// Mazetextsystemを継承 一時的
public class Main extends Mazetextsystem {

    public static void main(String[] args) {
        Scanner User_input = new Scanner(System.in);
        // ゲーム開始までのユーザー操作
        System.out.println("迷路ゲーム");
        System.out.println("ゲームを始めますか？ y");
        // Gametextメソッドを呼び出し処理させています
        // yと入力されたらゲームをはじめy以外はゲームを終了する。
        Gametext game = new Gametext();
        //textの表示と迷路の描画
        //TODO:迷路の描画は個別にメソッド化する
        game.gametextsystem();
        //
        //TODO:↓
        //while文 →ゴールしない限り
        //
        //プレイヤーコマの移動処理
        //新しい地図の描画
        //

    }
}
