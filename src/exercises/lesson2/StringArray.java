package exercises.lesson2;

import java.util.Arrays;

public class StringArray {
    public static void main(String [] args){
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        String[] newSentances = sentence.split("\\.");
        System.out.println(Arrays.toString(newSentances));
    }
}
