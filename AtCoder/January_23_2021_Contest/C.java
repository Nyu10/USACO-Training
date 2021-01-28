
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (solve(s)){
            System.out.print("Won");
        }
        else {
            System.out.print("Lost");
        }
    }
    public static boolean solve(String s){
        String check =s.substring(0,1);
        for (int i=1;i<s.length();i++){
            if (s.substring(i,i+1).equals(check)){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}