/*
ID: nemoyu
LANG: JAVA
TASK: friday
*/
import java.util.*;
import java.io.*;
public class friday {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Scanner scanner = new Scanner(new File("friday.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("friday.out"));
        int years = scanner.nextInt();
        int [] solution = new int[7];//monday is 0, sunday is 6
        for (int x:solution){
            x=0;
        }
        int [] normal_year={31,28,31,30,31,30,31,31,30,31,30,31};
        int [] leap_year={31,29,31,30,31,30,31,31,30,31,30,31};
        int firstDay=0; //January 1st
        for (int i=0;i<years;i++){
            int current_year=1900+i;
            boolean boo = isLeapYear(current_year);
            for (int month=0;month<12;month++){
                int day_of_the_week = (firstDay+12)%7;//January 13th %7 means its a saturday
                solution[day_of_the_week]+=1;
                if(boo){
                    firstDay+=leap_year[month];//first day of the month
                }
                else{
                    firstDay+=normal_year[month];//first day of the month
                }
            }
        }
        pw.print(solution[5]+" "+solution[6]+" ");
        for (int i=0;i<4;i++){
            pw.print(solution[i]+ " ");
        }
        pw.println(solution[4]);
        pw.close();
    }
    public static boolean isLeapYear(int year){
        if (year % 100 == 0) {
            return year % 400 == 0;
        } else {
            return year % 4 == 0;
        }
    }
}
