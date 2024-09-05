/*Combination related Questions
   formula for combination  n! / r!(n-r)!
   Total number oF pencils and Erasers in shop:N  and M
   Pencils to buy P
   Erasers to buy E 
   




Find the number of ways the  boe can get the things
    */

import java.util.*;
public class Combination{

    static int fact(int n){
        if(n==1)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
 System.err.println("Total number oF pencils and Erasers in shop");
 System.out.println("Enter the total Pencils:");
 int N=sc.nextInt();
 System.out.println("Enter the total Erasers:");
 int M=sc.nextInt();
 System.out.println("Enter the pencils to buy:");
 int P=sc.nextInt();
 System.out.println("Enter the Erasers to buy:");
 int E=sc.nextInt();
 int pen=fact(N)/(fact(P) * fact (N-P));

 int era=fact(M)/(fact(E) * fact (M-E));
System.out.println(pen*era);
    }
}