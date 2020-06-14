package exercises.lesson2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapStudentId {

    public static void main(String[] args) {

        HashMap<String, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and ids
        do {

            System.out.print("Student ID: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Name: ");
                String newName = input.nextLine();
                students.put(newStudent, newName);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<String, String> student : students.entrySet()) {
            System.out.println("Student Name: " + student.getValue() +", Student ID:"+student.getKey());

        }

    }
}
