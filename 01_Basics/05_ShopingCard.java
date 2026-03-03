import java.util.Scanner;
public class ShoppingCard {
    public static void main(String[] args) {
        
    
    
    Scanner scanner = new Scanner(System.in);{
        String item;
        double price ;
        int quantity ;
        char currency ='$' ;

    System.out.print("what items you like to Buy :");
    item = scanner.nextLine();
    System.out.print("what is the Price of each :");
    price = scanner.nextDouble();
    System.out.print("How Much do you want to Buy : ");
    quantity = scanner.nextInt();

    System.out.println("You sellected the items :" + item 
        +"\n Price of each is :" + currency + price +
        "\n Quantity is : " + quantity
    );
    
    double total = price * quantity;
    
  
    System.out.println("Your total Bill is " + currency + total);
 

    scanner.close();
}
}
}
