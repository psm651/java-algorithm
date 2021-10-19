package hackerRank.non_divisible_subset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        Set<Integer> set = new HashSet<>();

        StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
        int i =0;
        while (st1.hasMoreTokens()){
            arr[i]= Integer.parseInt(st1.nextToken());
            i++;
        }
        int before_size = 0;
        while (true) {
            for (int j = 0; j < n - 1; j++) {
                for (int l = j+1; l < n; l++) {
                    if ((arr[j] + arr[l]) % k != 0) {
                        set.add(arr[j]);
                        set.add(arr[l]);
                    }else{
                        set.remove(arr[j]);
                    }
                }
            }

            if (before_size == set.size()) {
                break;
            }
            before_size = set.size();
        }

        System.out.println(set.size());
        //Iterator<Integer> iterator = set.iterator();
        //while (iterator.hasNext()) {
        //    System.out.println(iterator.next());
        //}
    }
}
