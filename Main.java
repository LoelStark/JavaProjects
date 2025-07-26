import java.util.Scanner;
public class Main
//This shouldn't be nothing serious, just a basic Java calculator
{
    public static void Greeting()
    {
        System.out.println("Hello and welcome to Loel's basic Java Calculator..");
        System.out.println("Pick an option from the menu provided below: ");
    }

    public static void menu()
    {
        System.out.println("1.Addition\n2.Multiplication\n3.Division\n4.Subtraction");
    }
    public static void Addition()
    {
        Scanner Add = new Scanner(System.in);
        System.out.println("You have chosen addition.....");
        System.out.println("Enter the first number: ");
        int num1 = Add.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = Add.nextInt();
        int sum = num1 +num2;
        System.out.println("The sum of "+num1+" and "+num2+" is = "+sum);
    }
    public static void subtraction()
    {
        Scanner Sub = new Scanner(System.in);
        System.out.println("You have chosen subtraction.....");
        System.out.println("Enter the first number: ");
        int num1 = Sub.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = Sub.nextInt();
        int sum = num1 - num2;
        System.out.println("The difference of "+num1+" and "+num2+" is = "+sum);
    }
    public static void multiplication()
    {
        Scanner mul = new Scanner(System.in);
        System.out.println("You have chosen multiplication.....");
        System.out.println("Enter the first number: ");
        int num1 = mul.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = mul.nextInt();
        int sum = num1 * num2;
        System.out.println("The product of "+num1+" and "+num2+" is = "+sum);
    }
    public static void division()
    {
        Scanner div = new Scanner(System.in);
        System.out.println("You have chosen division.....");
        System.out.println("Enter the first number: ");
        double num1 = div.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = div.nextDouble();
        double sum = num1 / num2;
        System.out.println("The quotient of "+num1+" and "+num2+" is = "+sum);
    }

    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        Greeting();
        menu();
        System.out.println("Enter option: ");
        System.out.print("Wait before that, Enter your name: ");
        String name = sc.nextLine();
        System.out.println("It's a pleasure to meet you "+ name);
        System.out.print("Now, moving on "+name+" Enter an option from the menu above: ");
        int response = sc.nextInt();
        switch (response)
        {
            case 1:
                Addition();
                break;
            case 2:
                subtraction();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
            default:
                System.out.println("Invalid option selected, please rerun the code and try again..");
        }


    }
}
