import java.util.Scanner;
public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in) ;
       
        double width ;
        double Hight ;
        double Area ;

        System.out.print("Enter the Width :");
        width =scanner.nextDouble();

        System.out.print("Enter the Hight :");
        Hight= scanner.nextDouble();

        Area= width * Hight ;


       System.out.println("the Area is : " + Area );

        scanner.close();
        
    }
}
