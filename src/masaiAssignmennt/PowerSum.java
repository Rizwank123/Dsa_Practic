package masaiAssignmennt;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PowerSum {

	public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" "); 
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        System.out.println(countWaysUtil(a, b, 1));
    }

    private static int countWaysUtil(int remaining, int N, int current) {
        if (remaining == 0) {
            return 1;
        }
        if (remaining < 0) {
            return 0;
        }
        int count = 0;
        for (int i = current; Math.pow(i, N) <= remaining; i++) {
            count += countWaysUtil(remaining - (int) Math.pow(i, N), N, i + 1);
        }
        return count;
    }
}