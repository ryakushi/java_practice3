import java.util.Scanner;

public class Main {

  /**
   * 一致する確率
   *
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    long[] counter = new long[100001]; // 整数 v の出現回数を記録する配列

    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      counter[A[i]]++;
    }

    long allPattern = (long) N * (N - 1) / 2; // 全パターン数
    long samePattern = 0; // A から選んだ 2 つの整数が同じになるようなパターン数

    for (int i = 0; i < counter.length; i++) {
      // A から選んだ 2 つの整数がともに i であるようなパターン数を数える
      long val = counter[i];
      samePattern += val * (val - 1) / 2;
    }

    double ans = (double) samePattern / allPattern;
    System.out.println(ans);
  }
}
