

import java.util.Scanner;

/**
 * �p���O����
 */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); // �P��̐�
    String[] words = new String[N]; // �P���ۑ�����z��
    int[] counter = new int[26]; // �e�A���t�@�x�b�g�̏o���񐔂�ۑ�����z��
    // ���͂��ꂽ�P��̏���
    for (int i = 0; i < N; i++) {
      words[i] = sc.next(); // �P���ǂݍ���
      for (int j = 0; j < words[i].length(); j++) {
        char ch = words[i].charAt(j); // �P�ꂩ�當�����擾
        int charIndex = ch - 'a'; // �A���t�@�x�b�g�𐔒l�ɕϊ� ('a' -> 0, 'b' -> 1, ...)

        // �o�������A���t�@�x�b�g�̏o���񐔂��C���N�������g
        counter[charIndex]++;
      }
    }

    String ans = "Yes"; // ������Ԃł� "Yes" ��ݒ�
    // �e�A���t�@�x�b�g�̏o���񐔂��m�F���A1�������g���Ă��Ȃ��ꍇ�� "No" �ɍX�V
    for (int i = 0; i < 26; i++) {
      if (counter[i] == 0) {
        ans = "No";
        break;
      }
    }
    System.out.println(ans);
  }
}
