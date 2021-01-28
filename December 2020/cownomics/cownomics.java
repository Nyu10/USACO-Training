/*
ID: nemoyu
LANG: JAVA
TASK: 
*/
import java.util.*;
import java.io.*;
public class cownomics {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner r = new Scanner(new File("cownomics.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("cownomics.out"));
        //now use system.out.println?
        int N = r.nextInt(); //3 Spots, 3 Plain
        int M = r.nextInt(); //3 Spots, 3 Plain
        r.nextLine();
        String [][] arr = new String[N*2][M];
        for (int i=0;i<N*2;i++){
            String s = r.nextLine();
            arr[i]= s.split("");
        }
        String [] locations = new String[M];
        for (int i=0;i<locations.length;i++){
            locations[i]="";
        }
        for (int i=0;i<M;i++){
            for (int j=0;j<N*2;j++){
                locations[i]+=arr[j][i];
            }
        }
        pw.println(helper(locations,N));
        pw.close();
    }
    public static int helper(String [] arr, int n){
        int counter=0;
        for (int x=0;x<arr.length;x++){
            boolean answer = true;
            String one = arr[x].substring(0,n);
            String two= arr[x].substring(n);
            for (int i=0;i<one.length();i++){
                for (int j=0;j<two.length();j++){
                    if (one.substring(i,i+1).equals(two.substring(j,j+1))){
                        answer = false;
                    }
                }
            }
            if (answer) counter++;
        }
        return counter;
    }
}