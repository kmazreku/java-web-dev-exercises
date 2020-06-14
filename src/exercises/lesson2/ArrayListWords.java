package exercises.lesson2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListWords {
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<>();
        words.add("cat");
        words.add("words");
        words.add("cooks");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word length you want to search for:");
        int wordLength = input.nextInt();

    for (String singleWord:words){
        if(singleWord.length()==wordLength) {
            System.out.println(singleWord);
        }
    }
    }
}
