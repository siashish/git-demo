import java.util.Scanner;

public class caladd {
    public static void main(String[] args) {
        float a, b, res;
        char choice, ch;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("1. ADD TWO Numbers\n");
            System.out.println("2. EXIT\n\n");
            System.out.println("Enter your choice : ");
            choice = scan.next().charAt(0);
            switch(choice){
                case '1' : System.out.println("Enter Two Number : ");
                           a = scan.nextFloat();
                           b = scan.nextFloat();
                           res = a + b;
                           System.out.print("Result = " + res);
                           break;
                case '2' : System.exit(0);
                           break;
                default  : System.out.print("INVALID CHOICE !!!");
                           break; 
            }
            System.out.print("\n--------------------------------------------\n");
        }while(choice != 2);
    }
}