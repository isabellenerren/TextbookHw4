public class ExFour {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int c = a + b;
        System.out.print(a + ",");
        System.out.print(b + ",");
        int count = 0;
        while (count <= 30){
            System.out.print(c + ",");
            a = b;
            b = c;
            c = a + b;
            count++;
        }
    }
}
