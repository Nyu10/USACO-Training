
import java.util.*;
import java.io.*;
public class B {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int x=scanner.nextInt();
        int [] a=new int[n];
        int []b=new int[n];
        for (int i=0;i<n;i++){
            a[i]=scanner.nextInt();
            b[i]=scanner.nextInt();
        }
        int current_level=0;
        int counter=0;
        for (int i=0;i<n;i++ ){
            current_level+=a[i]*b[i]/100;
            counter++;
            if (current_level>x){
                break;
            }
        }
        if (current_level>x){
            System.out.print(counter);
        }
        else{
            System.out.print("-1");
        }
    }
}