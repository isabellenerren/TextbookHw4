public class ExTen {
    public static void main(String[] args){
        int num = 6;
        for (int row = 1; row <= 6; row++){
            for (int col = 1; col <= num; col ++){
                System.out.print("*");
            }
            num -= 1;
            System.out.println();
        }
    }
}
