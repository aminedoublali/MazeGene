import java.util.*;
import javax.sql.rowset.spi.SyncResolver;

// ！！！工事中

// 迷路生成のアルゴリズム
//壁伸ばし法 参考リンク: https://algoful.com/Archive/Algorithm/MazeExtend

public class algorithm {
  
  String[][] maze;//迷路そのもの
  int size;//迷路のサイズ

  //迷路のサイズ指定
  public static void algorithm() {
    System.out.println("5以上の奇数で迷路のサイズを指定してください");
    //数値を入力して任意のサイズの迷路を作成できるようにする
  }

  //迷路生成アルゴリズム
  public String[][] GeneMaze(String[] size) {  
    //TODO: 幅高さ5以上の奇数であることを確認する
    
    //roadlistで通路のリストを作る
    ArrayList<Integer[]> roadlist =  new ArrayList<Integer[]>();

    int num = 21;//迷路の大きさ テスト用の仮置き
    maze = new String[num][num];
    
    //迷路をすべて[]で埋める
    for(int i = 0; i < num; i++ ){
      //外周を壁、それ以外を通路に
      for (int g = 0: g < num; g++){
        if(i == 0 || g == 0 || i == num-1 || g == num-1){// i
          maze[g][i] = "[]";
        }else{
          maze[g][i] = "  ";
          roadlist.add
        }
      }

    }




    return maze;
  }
}

