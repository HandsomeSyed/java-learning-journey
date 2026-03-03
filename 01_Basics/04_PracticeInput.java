import java.util.Scanner;
public class precInput1 {
    public static void main(String[] args) {
      Scanner scanner =new Scanner(System.in);
      System.out.println("What is Your First name :");
      String Fname=scanner.nextLine();
      System.out.println("What is your last name ");
      String Lname=scanner.nextLine();
      System.out.println("What is your age :");
      int age =scanner.nextInt();
      System.out.println("what is your Email:");
      String emailString =scanner.next();
      System.out.println("what is your Email:");
      double GPA =scanner.nextDouble();

      System.out.println("***********************" +
      "\nName : " +Fname 
      +" "+ Lname + " \nAge : "  + 
       age +" "+ "\nyour Email : " + emailString
       +"\n GPA :"+ GPA +
       "\n**************************"
    
    
    );


      scanner.close();
    }
    
}
