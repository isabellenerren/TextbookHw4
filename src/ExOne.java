import java.util.Scanner;
public class ExOne {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        if (number % 2 == 0 && number > 2){
            System.out.println(number + " is not a prime number.");
        } else if (number % 3 == 0 && number > 3){
            System.out.println(number + " is not a prime number.");
        } else if (number % 5 == 0 && number > 5){
            System.out.println(number + " is not a prime number.");
        } else if (number % 7 == 0 && number > 7){
            System.out.println(number + " is not a prime number.");
        } else{
            System.out.println(number + " is a prime number.");
        }
    }
}
