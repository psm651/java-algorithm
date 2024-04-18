package programmers.no23;

import java.util.HashMap;
import java.util.Map;

public class Main1 {
    private static Map<Integer, Integer> fac = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        if (fac.containsKey(n)) {
            return fac.get(n);
        }
        int result = n * factorial(n - 1);
        fac.put(n, result);
        return result;
    }

    public static int solution(int n) {
        int result = 0;
        while (n > 0) {
            n = n / 5;
            result += n;
        }
        return result;
    }
}
