import java.util.*;
import java.io.*;
public class problem3 {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> cows= new ArrayList<Integer>();
        int n=scanner.nextInt();
        for (int i=0;i<n;i++){
            cows.add(scanner.nextInt());
        }
        ArrayList<Integer> stalls= new ArrayList<Integer>();
        for (int i=0;i<n;i++){
            stalls.add(scanner.nextInt());
        }
        Collections.sort(cows);
        Collections.sort(stalls);
        ArrayList<Integer> fits= new ArrayList<Integer>();
        for (int i=0;i<n;i++){
            fits.add(0);
        }
        for (int i=0;i<cows.size();i++){
            for (int j=0;j<stalls.size();j++){
                if (cows.get(i)<=stalls.get(j)){
                    fits.set(i,fits.get(i)+1);
                }
            }
        }
        Collections.sort(fits);
        int max = Collections.max(cows);
        ArrayList<Integer> differences= new ArrayList<Integer>();
        for (int x:fits){
            differences.add(max-x);
        }
        int factorial=max;
        int multiple=1;
        for (int i=0;i<differences.size();i++){
            multiple*=factorial-differences.get(i);
            factorial--;
        }
        System.out.println(multiple);
    }
}
