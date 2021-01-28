/*
ID: nemoyu
LANG: JAVA
TASK: word
*/

import java.util.*;
import java.io.*;


public class word{
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner r = new Scanner(new File("word.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("word.out"));
        //now use system.out.println?
        int words= r.nextInt();//
        int max=r.nextInt();
        r.nextLine();
        String s = r.nextLine();
        String [] array = s.split(" ");
        int x=0;
        for (int i=0;i<array.length;i++){
            if (array[i].length()+x<=max){
                if (x!=0){pw.print(" " + array[i]);}
                else {
                    pw.print(array[i]);
                }
                x+=array[i].length();
            }
            else{
                i--;
                x=0;
                pw.println("");
            }
        }
        pw.close();
    }
}