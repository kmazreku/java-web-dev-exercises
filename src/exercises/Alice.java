package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String sentence ="Alice was beginning to get very tired of sitting by her sister on the bank,"
        +"and of having nothing to do: once or twice she had peeped into the book her sister was reading,"
        +"but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice "
        +"'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your search term:");
        String term = input.nextLine();


        if (sentence.toLowerCase().contains(term.toLowerCase())){
            if(sentence.indexOf(term)==-1){
            Integer position =sentence.indexOf(term) +1;
            System.out.println("Your term is at index " +position);
            System.out.println("Your term length is:" +term.length());
            String newSentence = sentence.substring(0,sentence.indexOf(term)+1 ).concat(sentence.substring(sentence.indexOf(term)+term.length()+1));
            System.out.println(newSentence);}
            else{
                System.out.println("Your term is at index " +sentence.indexOf(term));
                System.out.println("Your term length is:" +term.length());
                String newSentence = sentence.substring(0,sentence.indexOf(term) ).concat(sentence.substring(sentence.indexOf(term)+term.length()+1));
                System.out.println(newSentence);}

        } else {
            System.out.println("false");
        }
    }
}
