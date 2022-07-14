import java.util.Scanner;

public class abc {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            if (checkNum(i)) {
                count++;
            }
        }
        System.out.println("count: " + count);
    }

    private static boolean checkNum(int num2) {
        if (num2 < 10) {
            System.out.println(num2);
            return true;
        } else if (String.valueOf(num2).charAt(0) == String.valueOf(num2).charAt(String.valueOf(num2).length() - 1)) {
            System.out.println(num2);
            return true;
        }
        return false;
    }
}
