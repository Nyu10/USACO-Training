/*
ID: nemoyu
LANG: JAVA
TASK: 
*/
import java.util.*;
import java.io.*;
public class herding {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner scanner = new Scanner(new File("herding.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("herding.out"));
        int n=scanner.nextInt();
        int moves=0;
        ArrayList<Integer> cows= new ArrayList<Integer>();
        for (int i=0;i<n;i++){
            cows.add(scanner.nextInt());
        }
        while (!sorted(cows)){
            int first = cows.get(0);
            int temp=cows.get(first);
            for (int i=first+1;i<cows.size();i++){
                int temp2=cows.get(i);
                cows.set(i,temp);
                temp=temp2;
            }
            moves++;
        }
        pw.println(moves);
        pw.close();
    }
    public static boolean sorted(ArrayList<Integer> cows){
        int prev=0;
        for (int i=1;i<cows.size();i++){
            if (cows.get(i)<prev){
                return false;
            }
        }
        return true;
    }
}