import java.util.*;

public class ifLadder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        if (marks >= 90) {
            System.out.println("Grade A");
        } 
        else if (marks >= 75) {
            System.out.println("Grade B");
        } 
        else if (marks >= 50) {
            System.out.println("Pass");
        } 
        else {
            System.out.println("You are failed");
        }

        scanner.close();
    }
}