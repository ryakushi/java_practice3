import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Nを取得し、Aを格納する配列を準備する
    int N = sc.nextInt();
    int[] A = new int[N];
    // 出現回数を記録するための配列
    int[] counter = new int[A.length + 1]; // 値の最大数+1を確保

    // Aの各要素を読み取り、出現回数をカウントする
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      counter[A[i]]++;
    }
    // 出現回数の最大値を見つける
    int max = -1;
    for (int i = 0; i < counter.length; i++) {
      max = Math.max(max, counter[i]);
    }
    // 出現回数が最大の要素を見つける
    int ans = -1;
    for (int i = 0; i < counter.length; i++) {
      if (counter[i] == max) {
        ans = i;
        break;
      }
    }
    // 最も出現回数が多い要素の値を出力する
    System.out.println(ans);
  }
}
