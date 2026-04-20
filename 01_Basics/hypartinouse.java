import java.util.*;
public class hypartinouse {
    // hyportinouse of a triangle is c = Math.squr(a^2 +b^2)
  public static void main(String[] args) {
 Scanner scanner =new Scanner(System.in);
   double a;
   double b;
   
   System.out.print("Enter side A :");
   a =scanner.nextDouble();

  System.out.print("Enter side B :");
   b =scanner.nextDouble();
   
   double c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
   System.out.println("The Hypartinouse is  :" +" "+ c);

   scanner.close();   
  }

}
