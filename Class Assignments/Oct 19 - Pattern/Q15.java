/*
Print this pattern:
* * * * *
  * * * *
    * * *
      * * 
        *                   */

import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of lines: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
}