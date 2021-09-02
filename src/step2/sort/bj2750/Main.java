package step2.sort.bj2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(br.readLine());
            arr[i] = val;
        }
        for(int index = 1 ; index < arr.length ; index++){
            int temp = arr[index];
            int aux = index - 1;
            while( (aux >= 0) && ( arr[aux] > temp ) ) {
                arr[aux+1] = arr[aux];
                aux--;
            }
            arr[aux + 1] = temp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
