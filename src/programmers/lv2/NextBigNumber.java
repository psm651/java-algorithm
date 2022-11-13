package programmers.lv2;

public class NextBigNumber {
    public static void main(String[] args) {
        int n = 15;
        int bitCount = Integer.bitCount(n);
        int i = n + 1;
        while (bitCount != Integer.bitCount(i)) {
            i++;
        }
        System.out.println(i);
    }
}
