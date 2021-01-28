//Nehemiah Yu
//Problem 1 January 2021 Bronze Contest
import java.util.*;
import java.io.*;
public class final1 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String alphabet = in.nextLine();//cowphabet
        String cow = in.nextLine();//bessie's words
        int num_of_alphabets=1;
        int [] letters= new int[cow.length()];//array to track the indices of the letters in the alphabet
        for (int x=0;x<letters.length;x++){
            char character= cow.charAt(x);
            int index = alphabet.indexOf(character);
            letters[x]=index;//index of character in the alphabet (a is 0, b is 1) mood is [13,15,15,4]
        }
        //compare indices to see how many times a letter is part of a diferent alphabet
        
        int previous_letter=letters[0];
        for (int x=1;x<letters.length;x++){
            if (letters[x]<=previous_letter){
                num_of_alphabets++;
            }
            previous_letter = letters[x];//set previous letter to current letter
        }
        System.out.println(num_of_alphabets);
    }
}