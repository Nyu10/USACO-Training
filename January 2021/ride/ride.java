/*
ID: nemoyu
LANG: JAVA
PROG: ride
*/

import java.util.*;
import java.io.*;


public class ride{
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner r = new Scanner(new File("ride.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("ride.out"));
        //now use system.out.println?
        String a = r.nextLine();
        String b = r.nextLine();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int asum=1;
        int bsum=1;
        for (int i=0;i<a.length();i++){
            String achar = a.substring(i,i+1);
            asum*=alphabet.indexOf(achar)+1;
        }
        for (int i=0;i<b.length();i++){
            String bchar=b.substring(i,i+1);
            bsum*=alphabet.indexOf(bchar)+1;
        }
        if (asum%47==bsum%47) pw.print("GO\n");
        else{
            pw.print("STAY\n");
        }
        pw.close();
    }
}