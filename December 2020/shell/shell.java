/*
ID: nemoyu
LANG: JAVA
TASK: shell
*/

import java.util.*;
import java.io.*;


public class shell{
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner r = new Scanner(new File("shell.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("shell.out"));
        //now use system.out.println?
        int [] arr = new int[3];int [] pick=new int[3];
        int n= r.nextInt();
        arr[0]=0;arr[1]=1;arr[2]=2;
        int temp=0;
        for (int i=0;i<n;i++){
            //these are indices
            int a= r.nextInt()-1;
            int b= r.nextInt()-1;
            int c= r.nextInt()-1;
            
            temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            pick[arr[c]]+=1;
        }

        int max = Math.max(pick[0],Math.max(pick[1],pick[2]));
        pw.print(max);
        pw.close();
    }
}