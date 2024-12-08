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
        int flag=0;//Flag is used to chack whether the element is present or not
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){  //Key is compared with each element with the key
                System.out.println("Element found at "+ (i+1) + " position"); //Element found
                flag=1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Element not found");
        }

    }
}
