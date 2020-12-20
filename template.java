/*
ID: nemoyu
LANG: JAVA
TASK: 
*/
import java.util.*;
import java.io.*;
public class template {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner r = new Scanner(new File(".in"));
        PrintWriter pw = new PrintWriter(new FileWriter(".out"));
        //now use system.out.println?
        int hello = r.nextInt();
        String s = r.nextLine();
        String [] array = s.split(" ");
        int []bruh = new int[100];
        pw.println(hello);
        pw.close();
    }
}

//String [] lol= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
//String lol= {"abcdefghjiklmnopqrstuvwxyz"};
//public static int[] frequency(String word1, String word2){