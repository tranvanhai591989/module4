import java.util.Scanner;

public class TrianglePrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the height");
        int height = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=height ; i++) {
            for (int j = 1; j <=i ; j++) {
                if (i==j|| j==1 ||i==height){
                    System.out.print("* ");
                }else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
