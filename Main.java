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
        //TODO:迷路の描画は個別にメソッド化する ← 迷路の描画は煩雑でないため毎時コードを書く
        

        //迷路の地図を描画するために地図を与える
        game.gametextsystem(); 

        //
        //while文 →ゴールしない限り
        //TODO: ！！重要！！ while文完了してしまっている。
        //
        PlMz PL = new PlMz();
        PL.ido();
        game.gameClear();

    }
}
