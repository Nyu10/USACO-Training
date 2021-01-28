/*
ID: nemoyu
LANG: JAVA
TASK: 
*/
import java.util.*;
import java.io.*;
public class blocks {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner r = new Scanner(new File("blocks.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("blocks.out"));
        //now use system.out.println?
        int n = r.nextInt();
        r.nextLine();
        //array length 25 for each character
        int [] letters= new int[26];
        for (int i=0;i<26;i++){
           letters[i]=0;
    }
        for (int i=0;i<n;i++){
            String s = r.nextLine();
            String [] array = s.split(" ");
            int [] temp = frequency(array[0],array[1]);
            for (int j=0;j<26;j++){
                letters[j]+=temp[j];
            }
        }
        for (int i=0;i<26;i++){
            if (i==25){
                pw.print(letters[i]);
                break;
            }
            pw.println(letters[i]);
        }   
        pw.close();
    }
    public static int[] frequency(String word1, String word2){
        int [] bruh = new int[26];
        int [] duh= new int [26];
        int [] answer = new int [26];
        String lol= "abcdefghijklmnopqrstuvwxyz";
        for (int i=0;i<26;i++){
                bruh[i]=0;
                duh[i]=0;
                answer[i]=0;
        }
        for (int i=0;i<word1.length();i++){
            bruh[lol.indexOf(word1.substring(i,i+1))]+=1;            
        }
        for (int i=0;i<word2.length();i++){
            duh[lol.indexOf(word2.substring(i,i+1))]+=1;
            
        }
        for (int i=0;i<26;i++){
            answer[i]= Math.max(bruh[i],duh[i]);
        }

        return answer;
    }
}
