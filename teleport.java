
/*
ID: nemoyu
LANG: JAVA
TASK: teleport
*/

import java.util.*;
import java.io.*;


public class teleport{
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner r = new Scanner(new File("teleport.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("teleport.out"));
        //now use system.out.println?
        int a= r.nextInt();//start and end
        int b=r.nextInt();
        int x=r.nextInt();//teleporter
        int y=r.nextInt();
        int min1=Math.abs(b-a);//nothing done
        //find use x or y
        int min2=0;
        if (Math.abs(a-x)>=Math.abs(a-y)){
            //use y
            min2= Math.abs(a-y)+Math.abs(b-x);
        }
        else{
            min2=Math.abs(a-x)+Math.abs(b-y);
        }
        if (min2>=min1){pw.println(min1);}
        else{
            pw.println(min2);
        }
        pw.close();
    }
}