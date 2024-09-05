/* Get an input from the user in Hours and minutes  
 * Consider the total duration during travel is 24 hours
 * if the given hours is lesser than 24 , then the remaining hours and minutes to reach the destination
 * if the given hours is greater than 24 ,then the hours and minutes which exceeds the 24 minutes should be printed 
 * with the negative sign
 * Example:
 * 
 * Input 1:
 * 15 
 * 30
 * Output 1:
 * 9:30
 * Input 2:
 * 30
 * 5
 * Output 2:
 * -6:5
*/




import java.util.*;
public class Trav{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       int hh=sc.nextInt();
       int mm=sc.nextInt();
       if(hh<=24){
             hh=24-hh;
             mm=60-mm;
             if(mm>0){
                hh=hh-1;
             }
            System.out.println(hh+":"+mm);
       }
       if(hh>24){
        System.out.println((24-hh)+":"+mm);
       }
    }
    }

    /*if the user gives both the input in minutes then covert into hours and minutes
    if the total given time is divided(/) by the  60 then it gives hours
    if the total given time is divided(%) by the 60 then it gives minutes*/