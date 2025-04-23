package masaiAssignmennt;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BubbleSortUsingRecursion {
	public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); 
        String[] strArr =  br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
          arr[i] = Integer.parseInt(strArr[i]);
        }
        bubbleSort(arr, n);
        for(int a: arr){
          System.out.print(a+" ");
        }
        System.out.println();
    }
    private static void bubbleSort(int[] arr, int n){
      if(n==1) return;
      
      for(int i=0;i<n-1;i++){
        if(arr[i]> arr[i+1] ){
          int temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
        }
      }
      bubbleSort(arr, n-1);
    }
}



