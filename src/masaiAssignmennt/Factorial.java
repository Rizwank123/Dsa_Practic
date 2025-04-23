package masaiAssignmennt;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {
	 //BufferedReader
	
	public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n =Integer.parseInt( br.readLine());                // Reading input from STDIN
       System.out.println(fact(n));
       
}
private static int fact(int n){
  if(n<=1) return 1;
  return n*fact(n-1);
}

}

