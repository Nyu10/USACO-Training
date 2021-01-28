import java.util.*;
import java.io.*;
public class problem2 {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayList<Integer> positive= new ArrayList<Integer>();
        ArrayList<Integer> negative= new ArrayList<Integer>();
        for (int i=0;i<n;i++){
            int x = scanner.nextInt();
            if (x%2==0){
                postive.add(x);
            }
            else{
                negative.add(-x);
            }
        }
        int numEvens=positive.size();
        int numOdds=negative.size();

    }
}