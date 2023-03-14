import java.util.Scanner;
public class ExTwo {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double sum = 0;
        double count = 0;
        System.out.print("Enter student grade: ");
        while (keyboard.hasNextDouble()){
            double input = keyboard.nextDouble();
            sum += input;
            count++;
            System.out.print("Enter next grade: ");
        }
        double avg = (sum / count);
        System.out.println("Average student grade is " + avg);
    }
}
