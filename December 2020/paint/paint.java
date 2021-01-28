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
        int ans = Math.max(a,(Math.max(b,Math.max(c,d))))-Math.min(a,Math.min(b,Math.min(c,d)));
        pw.println(ans);
        pw.close();
    }
}