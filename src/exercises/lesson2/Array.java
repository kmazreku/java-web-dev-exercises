package exercises.lesson2;

public class Array {
    public static void main(String[] args){
        int nums[] = {1, 1, 2, 3, 5, 8, 13, 21};
        int size = nums.length;

        for (int i =1; i<size;i=i+2) {
            System.out.println(nums[i]);
        }
    }


}
