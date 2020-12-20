/*
ID: nemoyu
LANG: JAVA
TASK: paint
*/

import java.util.*;
import java.io.*;


public class mixmilk{
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner r = new Scanner(new File("mixmilk.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("mixmilk.out"));
        //now use system.out.println?
        int a= r.nextInt();//cap
        int b=r.nextInt();
        int c=r.nextInt();//cap
        int d=r.nextInt();
        int e=r.nextInt();//cap
        int f=r.nextInt();
        int []bruh={b,d,f};
        for (int i=0;i<100;i++){
            if (i%3==0){
                if (bruh[0]+bruh[1]<=c){
                    int temp=bruh[0];
                    bruh[0]=0;
                    bruh[1]=temp+bruh[1];
                }
                else{
                    bruh[1]=c;
                    bruh[0]=bruh[0]-c;
                }
            }
            if (i%3==1){
                if (bruh[1]+bruh[2]<=e){
                    int temp=bruh[1];
                    bruh[1]=0;
                    bruh[2]=temp+bruh[2];
                }
                else{
                    bruh[2]=e;
                    bruh[1]=bruh[1]-e;
                }
            }
            if (i%3==2){
                if (bruh[2]+bruh[0]<=a){
                    int temp=bruh[2];
                    bruh[2]=0;
                    bruh[0]=temp+bruh[2];
                }
                else{
                    bruh[0]=a;
                    bruh[2]=bruh[2]-a;
                }
            }
        }
        for (int x: bruh){
            pw.println(x);
        }
        pw.close();
    }
}
/*
public static void pour(int i, int j)
{
    int amt=Math.min(m[i], c[j]-m[j]);
    // Amount of milk to pour is the minimum of the remaining milk in bucket i and the available capacity in bucket j
    m[i]-=amt;
    m[j]+=amt;
}
*/