import java.util.*;
public class IFStatment {
    public static void main(String[] args) {
     Scanner scanner= new Scanner(System.in);
     System.out.print("Enter Your age ");
     int age =scanner.nextInt();

     if (age >= 18) {
        System.out.println("Your are an Adult");
    
        }
        else
        System.out.println("You are a miner");
     





     scanner.close();
    }
}
