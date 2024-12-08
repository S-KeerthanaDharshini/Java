import java.util.*;
public class Bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        
        //Receiving the input array elements
        System.out.println("Enter the array Elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-1 - i ;j++){
            if(arr[j] > arr[j+1]){
                      int temp=arr[j];
                      arr[j]=arr[j+1];
                      arr[j+1]=temp;
            }
        }
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
}
}
}