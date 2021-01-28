
import java.util.*;
import java.io.*;
public class E {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();//number of pieces
        ArrayList<Long> Xpieces= new ArrayList<Long>();
        ArrayList<Long> Ypieces= new ArrayList<Long>();
        for (int i=0;i<n;i++){
            Xpieces.add(Long.valueOf(scanner.nextInt()));
            Ypieces.add(Long.valueOf(scanner.nextInt()));
        }
        int m=scanner.nextInt();//operations
        ArrayList<Integer> regular= new ArrayList<Integer>();
        ArrayList<Long> different= new ArrayList<Long>();
        for (int i=0;i<m;i++){
            int first = scanner.nextInt();
            if (first==3||first==4){
                different.add(Long.valueOf(scanner.nextInt()));
            }
            regular.add(first);
        }
        int queries=scanner.nextInt();
        ArrayList<Integer> A= new ArrayList<Integer>();
        ArrayList<Integer> B= new ArrayList<Integer>();
        for (int i=0;i<queries;i++){
            A.add(scanner.nextInt());
            B.add(scanner.nextInt());
        }
        for (int i=0;i<m;i++){//i counts operations
            for (int j=0;j<queries;j++){
                if (A.get(j)==0&i==0){
                    int which_piece= B.get(j);
                    System.out.print(Xpieces.get(which_piece-1)+ " "+Ypieces.get(which_piece-1));
                    System.out.println();
                }
            }

            if (regular.get(i)==1){
                for (int j=0;j<n;j++){
                    long xcurrent=Xpieces.get(j);
                    long ycurrent=Ypieces.get(j);
                    Xpieces.set(j,ycurrent);
                    Ypieces.set(j,-xcurrent);
                }
            }
            else if(regular.get(i)==2){
                for (int j=0;j<n;j++){
                    long xcurrent=Xpieces.get(j);
                    long ycurrent=Ypieces.get(j);
                    Xpieces.set(j,-ycurrent);
                    Ypieces.set(j,xcurrent);
                }
            }
            else if(regular.get(i)==3){
                Long p=different.get(0);
                different.remove(0);
                for (int j=0;j<n;j++){
                    Long xcurrent=Xpieces.get(j);
                    Long ycurrent=Ypieces.get(j);
                    Long distance = Math.abs(xcurrent-p);
                    if (xcurrent>p){
                        Xpieces.set(j,p-distance);
                    }
                    else{
                        Xpieces.set(j,p+distance);
                    }
                }
            }
            else if (regular.get(i)==4){
                long p=different.get(0);
                different.remove(0);
                for (int j=0;j<n;j++){
                    Long xcurrent=Xpieces.get(j);
                    Long ycurrent=Ypieces.get(j);
                    Long distance = Math.abs(ycurrent-p);
                    if (ycurrent>p){
                        Ypieces.set(j,p-distance);
                    }
                    else{
                        Ypieces.set(j,p+distance);
                    }
                }
            }
            for (int j=0;j<queries;j++){
                if (A.get(j)==i+1&A.get(j)!=0){
                    int which_piece= B.get(j);
                    System.out.print(Xpieces.get(which_piece-1)+ " "+Ypieces.get(which_piece-1));
                    System.out.println();
                }
            }
        }
    }
}