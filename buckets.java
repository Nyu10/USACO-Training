/*
ID: nemoyu
LANG: JAVA
TASK: bucket
*/

import java.util.*;
import java.io.*;


public class buckets{
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner r = new Scanner(new File("buckets.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("buckets.out"));
        //now use system.out.println?
        String [][] arr = new String[10][10];
        //barn 
        int a=0;int b=0;
        //rock
        int c=0;int d=0;
        //lake
        int e=0; int f=0;
        for (int i=0;i<10;i++){
            String s = r.nextLine();
            for (int j=0;j<10;j++){
                arr[i][j]=s.substring(j,j+1);
                if (arr[i][j].equals("B")){
                    a=i;//row
                    b=j;//column
                }
                if (arr[i][j].equals("R")){
                    c=i;
                    d=j;
                }
                if (arr[i][j].equals("L")){
                    e=i;
                    f=j;
                }
            }          
        }
        int ans =Math.abs(a-e)+Math.abs(b-f)-1;
        if (Math.abs(a-e)==0 && ((d<f &d>b)|| (d>f &d<b))) ans+=2;
        if (Math.abs(b-f)==0 && ((c<e &c>a)|| (c>e &c<a))) ans+=2;
        pw.print(ans);
        pw.close();
    }
}