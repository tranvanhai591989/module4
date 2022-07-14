import java.util.Scanner;

public class Sovong {
    public  static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = num1; i <= num2 ; i++) {
            if (checkNum(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
    private static boolean checkNum(int num2){
        if (num2<10) {
            return true;
        } else return String.valueOf(num2).charAt(0) == String.valueOf(num2).charAt(String.valueOf(num2).length() - 1);
    }
}
