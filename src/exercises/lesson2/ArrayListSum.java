package exercises.lesson2;

import java.util.ArrayList;

public class ArrayListSum {
    public static void main (String[] args){
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(4);
        num.add(7);
        num.add(90);
        num.add(13);
        num.add(48);
        num.add(110);
        num.add(4);
        num.add(1);
        num.add(4);

        int sum =0;

        for (int i: num){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
