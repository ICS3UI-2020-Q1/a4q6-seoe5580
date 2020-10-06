import java.util.Scanner;
/**
 * This program lets you know if a number is prime number or not
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates a scanner for the user input
    Scanner input = new Scanner(System.in);

    // Asks the user to put in a number
    System.out.println("Which number would you like to check?");

    // Gets the answer from the user
    int num = input.nextInt();

    // sets a vaule on a variable that its going to divid the user's integer
    int num2 = 2;

    // while looping to indentify prime numbers and non prime numbers
    while(num > num2){
      // checking if its not a prime number
      if(num % num2 == 0){
        System.out.println(num + " is not a prime number");
        break;
      }
      // adds one to the variable to the vaule so whenever it will loop it will apply different number for the equation every time
      num2 = num2 + 1;
      // checking if its a prime number
      if(num == num2){
        System.out.println(num + " is a prime number");
        break;
      }
    }
  }
}
// Mr.Lamont sorry for the late hand in but I wanted to use else if statement on the while } so that 1 and 2s could be a vaild option for the answer could you leave like a feedback on how to do it?