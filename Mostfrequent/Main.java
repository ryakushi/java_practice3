import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // N���擾���AA���i�[����z�����������
    int N = sc.nextInt();
    int[] A = new int[N];
    // �o���񐔂��L�^���邽�߂̔z��
    int[] counter = new int[A.length + 1]; // �l�̍ő吔+1���m��

    // A�̊e�v�f��ǂݎ��A�o���񐔂��J�E���g����
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      counter[A[i]]++;
    }
    // �o���񐔂̍ő�l��������
    int max = -1;
    for (int i = 0; i < counter.length; i++) {
      max = Math.max(max, counter[i]);
    }
    // �o���񐔂��ő�̗v�f��������
    int ans = -1;
    for (int i = 0; i < counter.length; i++) {
      if (counter[i] == max) {
        ans = i;
        break;
      }
    }
    // �ł��o���񐔂������v�f�̒l���o�͂���
    System.out.println(ans);
  }
}
