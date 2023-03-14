import java.util.Scanner;
public class ExNine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string value: ");
        String str = sc.nextLine();
        System.out.print("Enter a character value: ");
        String letter = sc.nextLine();
        int last = 0;
        last = str.lastIndexOf(letter);
        System.out.println("Last occurrence of the character " + "'" + letter + "'" + " in " + '"' + str + '"' + " is at index " + last);
    }
}
