import java.util.*;
import java.io.*;
public class problem1 {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner scanner = new Scanner(System.in);
        String cowphabet = scanner.nextLine();
        String bessie = scanner.nextLine();
        ArrayList<Integer> indices= new ArrayList<Integer>();
        for (int i=0;i<bessie.length();i++){
            String b= bessie.substring(i,i+1);
            int x = cowphabet.indexOf(b);
            indices.add(x);
        }
        int prev=indices.get(0);
        int count=1;
        for (int i=1;i<indices.size();i++){
            if (indices.get(i)<=prev){
                count++;
            }
            prev = indices.get(i);
        }
        System.out.println(count);
    }
}