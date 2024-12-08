import java.util.*;
public class Linear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        //Receiving the input array elements
        System.out.println("Enter the array Elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Key : ");
        int key=sc.nextInt();
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                System.out.println("Element found at "+ (i+1) + " position");
                flag=1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Element not found");
        }

    }
}
