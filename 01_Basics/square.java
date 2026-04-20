import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      int oneSide;

      

      System.out.println("Enter one side length :");

      oneSide =scanner.nextInt();
      
      int area = oneSide*2;
      System.out.println("area of square is : " + area);


        scanner.close();
    }
    

    
    
}
