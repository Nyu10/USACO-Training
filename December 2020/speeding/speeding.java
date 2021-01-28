/*
ID: nemoyu
LANG: JAVA
TASK: 
*/
import java.util.*;
import java.io.*;
public class speeding {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner r = new Scanner(new File("speeding.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("speeding.out"));
        //now use system.out.println?
        int n= r.nextInt();
        int m= r.nextInt();
        int [] road = new int [100];
        int [] driving = new int [100];
        int current=0;
        for (int i=0;i<n;i++){
            int x= r.nextInt();
            int y=r.nextInt();
            for (int j=current;j<current+x;j++){
                road[j]=y;
            }
            current+=x;
        }
        current =0;
        int ans=0;
        for (int i=0;i<m;i++){
            int x=r.nextInt();
            int y=r.nextInt();
            for (int j=current;j<current+x;j++){
                driving[j]=y;
                if (driving[j]-road[j]>ans){
                    ans=driving[j]-road[j];
                }
            }
            current+=x;
        }
        pw.println(ans);
        pw.close();
    }
}
