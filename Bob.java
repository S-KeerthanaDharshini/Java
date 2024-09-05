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