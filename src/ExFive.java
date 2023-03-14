import java.util.Scanner;
public class ExFive {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        int total = 1;
        int count = n;
        while (count > 0){
            total *= count;
            count--;
        }
        System.out.print(n + "! = " + total);
    }
}
