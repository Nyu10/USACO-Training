/*
ID: nemoyu
LANG: JAVA
TASK: beads
*/
import java.util.*;
import java.io.*;
public class beads {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner scanner = new Scanner(new File("beads.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("beads.out"));
        int n= scanner.nextInt();//number of beads
        String beads= scanner.next();
        beads+=beads;
        int max=0;
        for (int i=0;i<2*n;i++){
            int count1=0;
            String temp = "w";
            boolean firstOfItsKind=true;
            loop1: for(int j=i;j<2*n;j++){//loop 1
                String string=beads.substring(j,j+1);
                if (temp.equals(string) ||  string.equals("w")){
                    count1++;
                    if (!(string.equals("w"))){
                        firstOfItsKind=false;
                        temp=string;
                    }
                }
                else if (!string.equals("w")){
                    if (firstOfItsKind){
                        firstOfItsKind=false;
                        count1++;
                        temp=string;
                    }
                    else{
                        break loop1;
                    }
                }
            }
            temp="w";
            firstOfItsKind=true;
            int count2 =0;
            loop2: for (int j=i-1;j>=0;j--){//loop 2
                String string=beads.substring(j,j+1);
                if (temp.equals(string)||string.equals("w")){
                    count2++;
                    if (!string.equals("w")){
                        firstOfItsKind = false;
                        temp=string;
                    }
                }
                else if (!string.equals("w")){
                    if (firstOfItsKind){
                        firstOfItsKind=false;
                        count2++;
                        temp=string;
                    }
                    else{
                        break loop2;
                    }
                }
            }
            if (count1+count2>max){
                max = count1+count2;
            }
            if (count1+count2>=n){
                max=n;
                break;
            }
        }


        pw.println(max);
        pw.close();
    }
}
