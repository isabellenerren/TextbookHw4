import java.util.Scanner;
public class ExThree {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        int highest = 0;
        int lowest = 100;
        System.out.print("Enter student grade: ");
        while (keyboard.hasNextInt()){
            int input = keyboard.nextInt();
            if (input < lowest){
                lowest = input;
            }
            if (input > highest){
                highest = input;
            }
            System.out.print("Enter next grade: ");


        }
        System.out.println("Highest student grade is " + highest);
        System.out.println("Lowest student score is " + lowest);
    }
}
