package masaiAssignmennt;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumOfArr {
	public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int t = Integer.parseInt(br.readLine());                // Reading input from STDIN
        while(t-->0){
          int n = Integer.parseInt(br.readLine());
          String[]  str = br.readLine().split(" ");
          int[] arr = new int[n];
          for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(str[i]);
          }
          System.out.println(sum(arr, n));
        }
    }
    private static int sum(int[] arr, int n){
      if(n==0) return 0;
      return arr[n-1]+sum(arr, n-1);
    }

}
