/*
ID: nemoyu
LANG: JAVA
TASK: promote
*/

import java.util.*;
import java.io.*;


public class promote{
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner r = new Scanner(new File("promote.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("promote.out"));
        //now use system.out.println?
        int a= r.nextInt();//bronze before
        int b=r.nextInt();
        int c=r.nextInt();//silver before
        int d=r.nextInt();
        int e=r.nextInt();//gold before
        int f=r.nextInt();
        int g=r.nextInt();//plat before
        int h=r.nextInt();

        int x=0;int y=0; int z=0;//x is gold to plat
        x= h-g;
        y=(h+f)-(g+e);
        z=(h+f+d)-(g+e+c);

        pw.println(z);
        pw.println(y);
        pw.println(x);
        pw.close();
    }
}