import java.util.*;
	public class Cake{
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        int alice=0,bob=0;
	        int[] a=new int[3];
	        int[] b=new int[3];
	        for(int i=0;i<3;i++){
	            a[i]=sc.nextInt();
	        }
	        for(int i=0;i<3;i++){
	            b[i]=sc.nextInt();
	        }
	        for(int i=0;i<3;i++){
	            if(a[i]>b[i]){
	                alice++;
	            }else  if(b[i]>a[i]){
	                bob++;
	            }else{
	                alice=alice;
	                bob=bob;
	            }
	               
	            }
	            System.out.print(alice+" "+bob);
	        }
	    }