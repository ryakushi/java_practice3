import java.util.Scanner;

public class Main {

  /**
   * ��v����m��
   *
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    long[] counter = new long[100001]; // ���� v �̏o���񐔂��L�^����z��

    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      counter[A[i]]++;
    }

    long allPattern = (long) N * (N - 1) / 2; // �S�p�^�[����
    long samePattern = 0; // A ����I�� 2 �̐����������ɂȂ�悤�ȃp�^�[����

    for (int i = 0; i < counter.length; i++) {
      // A ����I�� 2 �̐������Ƃ��� i �ł���悤�ȃp�^�[�����𐔂���
      long val = counter[i];
      samePattern += val * (val - 1) / 2;
    }

    double ans = (double) samePattern / allPattern;
    System.out.println(ans);
  }
}
