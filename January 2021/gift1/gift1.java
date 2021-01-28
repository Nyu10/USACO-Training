/*
ID: nemoyu
LANG: JAVA
PROG: gift1
*/

import java.util.*;
import java.io.*;


public class gift1{
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner r = new Scanner(new File("gift1.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("gift1.out"));
        int NP = r.nextInt();
        r.nextLine();
        String [] names = new String[NP];
        int [] accounts = new int[NP];
        for (int x:accounts){
            x=0;
        }
        for (int i=0;i<NP;i++){
            String name = r.nextLine();
            names[i]=name;
        }
        while (r.hasNextLine()){
            String giver = r.nextLine();
            int money = r.nextInt();
            int friends = r.nextInt();
            if (r.hasNextLine()) r.nextLine();
            for (int i=0;i<friends;i++){
                String receipient = r.nextLine();
                int rindex = java.util.Arrays.asList(names).indexOf(receipient);
                accounts[rindex]+=money/friends;
            }
            if (friends!=0 & money!=0){
            int gindex = java.util.Arrays.asList(names).indexOf(giver);
            accounts[gindex]=accounts[gindex]-money+(money%friends);
            }
        }
        for (int i=0;i<NP;i++){
            pw.println(names[i]+" "+accounts[i]);
        }
        pw.close();
    }
}