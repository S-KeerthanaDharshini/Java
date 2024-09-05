//Finding the maximum number of posiible ways  the bob can eat the pizza

import java.util.*;
public class Piiza{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int count=0;
int maxicount=0;
 System.out.println("Enter the number od Pizzas:");
 int N=sc.nextInt();
 System.out.println("Enter the flavours");
 int  F=sc.nextInt();
 int eats=F-1;
 int pizza[]=new int[N];
   for(int i=0;i<N;i++){
      pizza[i]=sc.nextInt();
   }
   for(int i=0;i<N;i++){
      if(eats >= pizza[i]){
         count++;
        if(maxicount<count){
         maxicount=count;
        }
      }
      if(eats <pizza[i]){
         count=0;
         
      }
   }
   System.out.println(maxicount);
   sc.close();
 }
}