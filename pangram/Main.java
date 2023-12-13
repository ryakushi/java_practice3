

import java.util.Scanner;

/**
 * パングラム
 */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); // 単語の数
    String[] words = new String[N]; // 単語を保存する配列
    int[] counter = new int[26]; // 各アルファベットの出現回数を保存する配列
    // 入力された単語の処理
    for (int i = 0; i < N; i++) {
      words[i] = sc.next(); // 単語を読み込む
      for (int j = 0; j < words[i].length(); j++) {
        char ch = words[i].charAt(j); // 単語から文字を取得
        int charIndex = ch - 'a'; // アルファベットを数値に変換 ('a' -> 0, 'b' -> 1, ...)

        // 出現したアルファベットの出現回数をインクリメント
        counter[charIndex]++;
      }
    }

    String ans = "Yes"; // 初期状態では "Yes" を設定
    // 各アルファベットの出現回数を確認し、1文字も使われていない場合は "No" に更新
    for (int i = 0; i < 26; i++) {
      if (counter[i] == 0) {
        ans = "No";
        break;
      }
    }
    System.out.println(ans);
  }
}
