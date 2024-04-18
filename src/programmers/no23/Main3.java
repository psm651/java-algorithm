package programmers.no23;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution(7));

    }

    public static int solution(int n) {
        //큰거 다담고 시작
        int boxSize5 = n / 5;
        int remainObjects = n % 5;

        while (boxSize5 >= 0) {
            if (remainObjects % 3 == 0) {
                return boxSize5 + (remainObjects / 3);
            }
            boxSize5--;
            remainObjects = remainObjects + 5;
        }
        return -1;
    }
}
