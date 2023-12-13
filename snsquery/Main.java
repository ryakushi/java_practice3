import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); //�l��
    int Q = sc.nextInt(); //�N�G���̐�

    // ���[�U�[ i �����[�U�[ j ���t�H���[���Ă���� isfollow[i][j] = 1 �Ƃ��� 2 �����z��
    int[][] isfollow = new int[N][N];
    // ���[�U�[ v �̃t�H�����[��
    int[] counter = new int[N];

    // �N�G���̏���
    for (int i = 0; i < Q; i++) {
      int queryType = sc.nextInt();
      if (queryType == 0) {
        //follow �N�G��
        int x = sc.nextInt(); // ���[�U�[ x ��
        int y = sc.nextInt(); // ���[�U�[ y ���t�H���[����

        if (isfollow[x][y] == 0) {
          // �V���Ƀt�H���[����ꍇ�́Acounter[y] �� 1 ���₷
          isfollow[x][y] = 1;
          counter[y]++;
        }
      } else if (queryType == 1) {
        // unfollow �N�G��
        int x = sc.nextInt(); // ���[�U�[ x ��
        int y = sc.nextInt(); // ���[�U�[ y �̃t�H���[���O��

        if (isfollow[x][y] == 1) {
          // �t�H���[���O���ꍇ�́Acounter[y] �� 1 ���炷
          isfollow[x][y] = 0;
          counter[y]--;
        }
      } else if (queryType == 2) {
        // count_followers �N�G��
        int z = sc.nextInt(); // ���[�U�[ z �̃t�H�����[�����o��
        System.out.println(counter[z]);
      }
    }

   
  }
}
