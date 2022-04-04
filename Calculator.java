import java.util.Scanner;
public class Calculator {
  public static void main(String[] args) {

    char operator;
    Double number1, number2, result;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    System.out.println("Enter number beside the operation to perform: Add, Subtract,Multiply, or Divide");
    operator = input.next().charAt(0);


   
    switch (operator) {

      // performs addition between numbers
      case '1':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      // performs subtraction between numbers
      case '2':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      // performs multiplication between numbers
      case '3':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      // performs division between numbers
      case '4':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}

