/*
ID: nemoyu
LANG: JAVA
TASK: paint
*/

import java.util.*;
import java.io.*;


public class paint{
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner r = new Scanner(new File("paint.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("paint.out"));
        //now use system.out.println?
        int a= r.nextInt();
        int b=r.nextInt();
        int c=r.nextInt();
        int d=r.nextInt();
        int []bruh = new int[100];
        for (int i=0;i<bruh.length;i++){
            if (i<=b & i>=a){
                bruh[i]=1;
            }
            if (i<=d & i>=c){
                bruh[i]=1;
            }
        }
        int ans=0;
        for (int i=0;i<bruh.length;i++){
            if (bruh[i]==1){
                ans+=1;
            }
        }
        pw.println(ans);
        pw.close();
    }
}