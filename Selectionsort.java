import java.util.Scanner;

public class Selectionsort {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        
        //Receiving the input array elements
        System.out.println("Enter the array Elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int temp= arr[i];
                arr[i] =arr[j];
                arr[j]=temp;
            }
        }
    }








    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
}
}
}