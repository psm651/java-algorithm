package programmers.lv2;

public class SequenceNumber {
    public static void main(String[] args) {
        int count = 0;
        int s = 15;
        for (int i = 1; i <= s; i++) {
            int tmp = 0;
            int inum = i;
            while (true) {
                tmp += inum;
                if (tmp == s) {
                    count += 1;
                    break;
                }
                if (tmp > s) {
                    break;
                }
                inum++;
            }
        }
        System.out.println(count);
    }
}
