/*
Print the following pattern
5 4 3 2 1
 4 3 2 1 
  3 2 1
   2 1
    1
*/

import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        sc.close();

        //for lines
        for(int i=n; i>=1; i--) {
            //for spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //for numbers
            for(int k=i; k>=1; k--) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
