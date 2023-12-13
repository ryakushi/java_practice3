import java.util.Scanner;

/**
 * Main
 *
 * WŒv‚Ì–â‘è
 */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    int[] counter = new int[100001];

    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      counter[A[i]]++;
    }

    int Q = sc.nextInt();
    for (int i = 0; i < Q; i++) {
      int x = sc.nextInt();
      System.out.println(counter[x]);
    }
  }
}
