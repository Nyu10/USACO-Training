//Nehemiah Yu
//Problem 2 January 2021 Bronze Contest
import java.util.*;
import java.io.*;
public class final2 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int odd = 0;
        int even =0;
        for (int x=0;x<n;x++){
            int cow_number=in.nextInt();
            if (cow_number%2==0) even++;
            if (cow_number%2==1) odd++;
        }
        System.out.println(solve(odd, even));
    }
    public static int solve(int odd, int even){
        if (even==odd){
            return odd+even;
        }
        else if (even>odd){
            return odd*2+1;
        }
        else{
            if ((odd-even)%3==0){
                return (even*2)+((odd-even)*2)/3;
            }
            else if ((odd-even+1)%3==0){
                return (even*2)-1+((odd-even+1)*2)/3;
            }
            else{
                return (even*2)+((odd-even-1)*2)/3-1;
            }
        }

    }
}
