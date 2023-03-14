import java.util.Scanner;
public class ExEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int num = str.length();
        String reverse = "";
        num -= 1;
        while (num >= 0){
            reverse = reverse + str.charAt(num);
            num--;
        }
        System.out.println("Reverse of " + '"' + str + '"' + " is " + '"' + reverse + '"');


    }
}
