package masaiAssignmennt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Power {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" "); 
		int a = Integer.parseInt(str[0]);
		int b= Integer.parseInt(str[1]);
		System.out.println(power(a,b));    // Writing output to STDOUT
	}

private static int power(int a, int b){
 if(b==0) return 1;
 else if (b< 0) return 1/(power(a, -1*b));
 return a* power(a, b-1);
}

}
