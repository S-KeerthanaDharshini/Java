import java.util.*;

public class Binary {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[5];
        //Receiving the array elements
        System.out.println("Enter the array Elements : ");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();

        }
        //Receiving the key
        System.out.println("Enter the key : ");
        int key =sc.nextInt();
        int l=0;
        int h=arr.length-1;
        int flag=0;
        while(l<=h){
            int mid=(l + h)/2;
            if(arr[mid] == key){  //calculated mid is compared with key 
               System.out.println("Element found at "+(mid+1)+" position");
               flag=1;
               break;
            }
            else if(arr[mid] < key){   
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        if(flag == 0){
            System.out.println("Element not found");
        }

    }
}
