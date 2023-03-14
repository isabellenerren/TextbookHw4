import java.util.Scanner;
public class ExSix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        int sum = 0;
        int initialNum = num;
        int n;
        while (num > 0){
            n = (num % 10);
            sum += n;
            num = (num /10);
        }
        System.out.println("Sum of digits of " + initialNum + " is " + sum);
    }
}
