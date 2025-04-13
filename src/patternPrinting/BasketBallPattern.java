package patternPrinting;

import java.util.Scanner;

public class BasketBallPattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            PrintPatter(n);
        }
    }

    private static void PrintPatter(int n) {
       for(int i=1;i<=n/2;i++) {
    	   for(int j=1;j<=n/2;j++) {
    		   System.out.print(" ");
    	   }
    	   for(int j=1;j<=n+2;j++) {
    		   System.out.print(" ");
    	   }
    	   for(int j=1;j<=i;j++) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       } // uper part 
       
       for(int i=1;i<=n+4;i++) {
    	   if(i==1) {
    		   for(int j=1;j<=n/2;j++) {
    			   System.out.print(" ");
    		   }
    		   for(int j=1; j<=n+n;j++) {
    			   System.out.print("*");
    		   }
    	   } // vertical line 
    	   else {
    		   for(int j=1;j<=n/2;j++) {
    			   System.out.print(" ");
    		   }
    		   for(int j=1;j<n+4;j++) {
    			   if(j ==1 ) {
    				   System.out.print("*");
    			   }
    		   }
    		   if( i<= n/2) {
    			   for(int j=n;j<=n+4;j++) {
    				   if( j< n+2-i) {
    					  System.out.print("*");
    				   }
    			   }
    		   }
    	   } // horizatal line and reverse half pyromid
    	   System.out.println();
       }
       for(int i=1;i<=n;i++) {
    	   System.out.print("*");
       }
    }
}

// end of PrintPatter
