/*  Adding up the consecutive letters which is even in count
 * 
 * Ex:
 * Input 1:
 * aaaabbcbbbdd
 * Output 1:
 * 8
 * 
 */





import java.util.*;

public class Count{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    
    int N=str.length();
    int i=0;
   // int j=0;
    int count=0;
    int maxcount=0;
    while(i<=N/2){
      
        count=1;
        for(int j=i+1;j<N;j++){
            if(str.charAt(i)== str.charAt(j)){
                count++;
            }
            else{
                if(count % 2==0){
                    maxcount=maxcount+count;
                }
                i=j;
                //break;
            }
        
        }
    }
    System.out.println(maxcount);
    sc.close();
}
}
