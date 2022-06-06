package programmers.no6;

public class Main {
    public static void main(String[] args) {
        //int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
//        String hand = "right";
//        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
//        String hand = "left";
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand = "right";
        StringBuilder sb = new StringBuilder();
        int left=10, right=12;
        int L_dis, R_dis;
        for(int n : numbers) {
            if(n == 1 || n == 4 || n == 7) {
                sb.append("L");
                left = n;

            }else if(n == 3 || n == 6 || n == 9) {
                sb.append("R");
                right = n;

            }else {
                if(n==0) n += 11;
                L_dis = (Math.abs(n-left))/3 + (Math.abs(n-left))%3;
                R_dis = (Math.abs(right-n))/3 + (Math.abs(right-n))%3;
                if(L_dis == R_dis) {
                    if(hand.equals("right")) {
                        sb.append("R");
                        right = n;
                    }else {
                        sb.append("L");
                        left = n;
                    }
                }else if(L_dis > R_dis) {
                    sb.append("R");
                    right = n;
                }else {
                    sb.append("L");
                    left = n;
                }
            }
        }
        System.out.println(sb.toString());

    }
}
