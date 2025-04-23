package masaiAssignmennt;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LengthOfStringUsingRecursion {
	public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();                // Reading input from STDIN
        System.out.println(lengthOfStr(s));    // Writing output to STDOUT
    }
    private static int lengthOfStr(String s){
      if(s.isEmpty()){
        return 0;
      }
      return 1+ lengthOfStr(s.substring(1));
    }
}


