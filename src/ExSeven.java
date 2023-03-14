import java.util.Scanner;
public class ExSeven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String first = sc.nextLine();
        System.out.print("Enter second string: ");
        String second = sc.nextLine();
        int lenOne = first.length();
        int lenTwo = second.length();
        String newString = ('"' + first + " " + second + '"');
        if (lenOne > lenTwo){
            System.out.println("String " + '"' + first + '"' + " is longer than String " + '"' + second + '"');
            System.out.println("String " + '"' + second + '"' + " appears before String " + '"' + first + '"' + " in lexiographic order");
            System.out.println("New sentence created is " + newString);
        } else if (lenOne < lenTwo){
            System.out.println("String " + '"' + first + '"' + " is not longer than String " + '"' + second + '"');
            System.out.println("String " + '"' + second + '"' + " appears after String " + '"' + first + '"' + " in lexiographic order");
            System.out.println("New sentence created is " + newString);
        } else {
            System.out.println("String " + '"' + first + '"' + " is not longer than String " + '"' + second + '"');
            System.out.println("String " + '"' + second + '"' + " is the same as String " + '"' + first + '"' + " in lexiographic order");
            System.out.println("New sentence created is " + newString);
        }


    }
}
