//Nehemiah Yu
//Problem 3 January 2021 Bronze Contest
import java.util.*;
import java.io.*;
public class final3 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        Long [] heights_of_cows=new Long[n];
        Long [] heights_of_stalls = new Long[n];
        for (int x=0;x<n;x++){
            heights_of_cows[x]=Long.valueOf(in.nextInt());
        }
        for (int x=0;x<n;x++){
            heights_of_stalls[x]=Long.valueOf(in.nextInt());
        }
        //sorts arrays from max to min(descending order)
        heights_of_cows=reverse_sort(heights_of_cows);
        heights_of_stalls=reverse_sort(heights_of_stalls);
        int counter=0;
        Long product_solution=Long.valueOf(1);
        for (int cow=0;cow<heights_of_cows.length;cow++){
            int stalls_cow_can_fit=0;
            for (int stall=0;stall<heights_of_stalls.length;stall++){
                if (heights_of_cows[cow]<=heights_of_stalls[stall]){
                    stalls_cow_can_fit++;
                }
            }
            product_solution*=Long.valueOf(stalls_cow_can_fit-counter);
            counter++;
        }
        System.out.println(product_solution);
    }

    //sorts from max to min(descending order)
    public static Long[] reverse_sort(Long[] array){
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]<array[j]){
                    Long temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }

}
