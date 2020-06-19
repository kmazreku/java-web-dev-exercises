package org.launchcode.java.studios.counting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you sentanse:");
    //String myString ="If the product of two terms is zero then common "+
    //        "sense says at least one of the two terms has to be zero to "+
      //      "start with. So if you move all the terms over to one side, "+
       //     "you can put the quadratics into a form that can be factored "+
       //     "allowing that side of the equation to equal zero. Once you’ve "+
        //    "done that, it’s pretty straightforward from there.";

        String myString = input.nextLine().toLowerCase();

      char[] charactersInString = myString.toCharArray();
       Map <String, Integer> alphabet = new HashMap<>();
       int count = 0;

       String nonalphabeticStr="0123456789,.'? ";
       char[] nonalphabetic =nonalphabeticStr.toCharArray();


        for (char j:charactersInString){
         for (int i=0; i<charactersInString.length; i++){
                if(j == charactersInString[i]){
                    count ++;
                    }
                if (j!=nonalphabetic[i]  ){

        String keyChar = Character.toString(j);
                alphabet.put(keyChar,count);
                }
    }
count =0;
}
        for (Map.Entry<String, Integer> characters : alphabet.entrySet()) {
            System.out.println(characters.getKey() + ": "+characters.getValue());

        }
    }
}
