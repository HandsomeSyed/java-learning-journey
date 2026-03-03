import java.util.Scanner;
public class ageCalculater {
public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.out.print("Enther the Year of birth :");
    int Cyear = 2026;
    

   int yearOfbirth = scanner.nextInt();

   int x = Cyear - yearOfbirth ;
System.out.println("you are " + x +" " + "Year's Old");
   scanner.close();

}    
}
