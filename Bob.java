/*One day Bob is playing Zombie World video game. 
In Zombie World game each round will contain N zombie's and each zombie's energy is Zi (where 1<=i<=N).
Bob will start the round with B energy. In order to move to the next level Bob need to kill all the N zombie's but Bob can select any one among N Zombie's.
If energy of Bob (B) is less than Zombie energy (Zi) then Bob will die and lose the round else Bob will won, during the fighting with zombie,
Bob will lose his energy by (Zi%2)+(Zi/2). At any point of game Bob will play optimally.
Now your task is to find out whether Bob can reach to the next level or not.

Input Format:
First line will contains B and N, separated by space,
where B is the energy of Bob and N is the number of Zombie.
Next line will contain N spaced integers each will represent the energy of zombie.

Line 1
B N, where B is the energy of Bob and N is the number of Zombie

Line 2
Zi, where Zi is a list containing energy of zombies separated by space
*/


import java.util.*;
public class Bob{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
 System.err.println("Enter the  Energy");
 int Bob=sc.nextInt();
 System.out.println("Enter the number of Zombies:");
 int N=sc.nextInt();
 System.out.println("Enter the energy of Zombie:");
 int ze[]=new int[N];
 for(int i=0;i<N;i++){
    ze[i]=sc.nextInt();

 }
 for(int i=0;i<N;i++){
   if(Bob > ze[i]){ 
    Bob=Bob-((ze[i] % 2)+ (ze[i] / 2) );
   }
   else{
    System.out.println("Cannot move to next round");
    break;
   }

 }
 System.out.println("Can Move");
sc.close();

}
}
