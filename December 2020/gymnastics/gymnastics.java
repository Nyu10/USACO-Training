/*
ID: nemoyu
LANG: JAVA
TASK: 
*/
import java.util.*;
import java.io.*;
public class gymnastics {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner r = new Scanner(new File("gymnastics.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("gymnastics.out"));
        //now use system.out.println?
        int K = r.nextInt();
        int N = r.nextInt();
        int [][] array = new int[K][N];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                array[i][j]= r.nextInt()-1;
            }
        }
        int ans=0;
        int counter=0;
        for (int i=0;i<N;i++){
            for (int j=i+1;j<N;j++){
                for (int bruh=0;bruh<K;bruh++){
                    int one = findIndex(array[bruh], i,N);
                    int two = findIndex(array[bruh], j,N);
                    System.out.println(one+" "+two);
                    if (one<two) counter++;
                }
                if (counter==0||counter==K){
                    ans++;
                }
                counter=0;
            }
        }
        pw.println(ans);
        pw.close();
    }

public static int findIndex(int comeon[], int x,int N){ 
        for (int trash=0;trash<N;trash++){
            if (comeon[trash]==x){
                return trash;}
        }
        return -1;
    }
    
}