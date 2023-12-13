import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); //人数
    int Q = sc.nextInt(); //クエリの数

    // ユーザー i がユーザー j をフォローしていれば isfollow[i][j] = 1 とする 2 次元配列
    int[][] isfollow = new int[N][N];
    // ユーザー v のフォロワー数
    int[] counter = new int[N];

    // クエリの処理
    for (int i = 0; i < Q; i++) {
      int queryType = sc.nextInt();
      if (queryType == 0) {
        //follow クエリ
        int x = sc.nextInt(); // ユーザー x が
        int y = sc.nextInt(); // ユーザー y をフォローする

        if (isfollow[x][y] == 0) {
          // 新たにフォローする場合は、counter[y] を 1 増やす
          isfollow[x][y] = 1;
          counter[y]++;
        }
      } else if (queryType == 1) {
        // unfollow クエリ
        int x = sc.nextInt(); // ユーザー x が
        int y = sc.nextInt(); // ユーザー y のフォローを外す

        if (isfollow[x][y] == 1) {
          // フォローを外す場合は、counter[y] を 1 減らす
          isfollow[x][y] = 0;
          counter[y]--;
        }
      } else if (queryType == 2) {
        // count_followers クエリ
        int z = sc.nextInt(); // ユーザー z のフォロワー数を出力
        System.out.println(counter[z]);
      }
    }

   
  }
}
