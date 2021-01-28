/*
ID: nemoyu
LANG: JAVA
TASK: milk2
*/
import java.util.*;
import java.io.*;
public class milk2 {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner scanner = new Scanner(new File("milk2.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("milk2.out"));
        int n= scanner.nextInt();
        ArrayList<Integer> starts = new ArrayList<Integer>();
        ArrayList<Integer> ends = new ArrayList<Integer>();
        for (int i =0;i<n;i++){
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            //interesting way to sort start/ends times before adding
            int j=0;//makes sure start end time have same indices and starts are sorted
            for (j=0;j<starts.size();j++){
                if (starts.get(j)>start){
                    break;
                }
            }
            starts.add(j,start);
            ends.add(j,end);
        }
        for (int i=0;i<=n+1;i++){
            loop: for (int first =0;first<starts.size();first++){
                for (int second =0;second<starts.size();second++){
                    if (first!=second){
                        if (starts.get(first)>starts.get(second)){
                            if (starts.get(first)<=ends.get(second)){
                                if (ends.get(first)>=ends.get(second)){
                                    ends.set(second,ends.get(first));
                                }
                                starts.remove(first);
                                ends.remove(first);
                                break loop;
                            }
                        }
                        else{
                            if (ends.get(first)>=starts.get(second)){
                                if(ends.get(first)<=ends.get(second)){
                                    ends.set(first,ends.get(second));
                                }
                                starts.remove(second);
                                ends.remove(second);
                                break loop;
                            }
                        }
                    }
                }
            }
        }
        int maxMilk=0;
        int maxNoMilk=0;
        for (int i=0;i<starts.size();i++){
            int length = ends.get(i)-starts.get(i);
            int none =0;
            if (i+1<starts.size()){
                none = starts.get(i+1)-ends.get(i);
            }
            maxMilk=Math.max(maxMilk,length);
            maxNoMilk=Math.max(maxNoMilk,none);
        }
        
        pw.println(maxMilk+" "+maxNoMilk);
        pw.close();
    }
}
//array of a million and mark off times
//read list of times, sort it by start time, walk over the list once, merging overlapping times
//walk the list watching for longest milking/no milking periods