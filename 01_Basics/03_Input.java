import java.util.Scanner;
public class input{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your name:");
        String Name =scanner.nextLine();
        System.out.println("What is  your Age:");
        int age =scanner.nextInt();
        System.out.println("enter your GPA:");
        double GPA=scanner.nextDouble();
    

        System.out.println("hello " + Name);
        System.out.println("YOU ARE "+ age +" Year Old");
        System.out.println("YOUR GPA IS :"+ GPA );
        System.out.println();
        scanner.close();
    }
}
