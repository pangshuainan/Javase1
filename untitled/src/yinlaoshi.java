import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class yinlaoshi {
    private static yinlaoshi AiLi;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        AiLi.pringXing(5, 10);
    }

    public static void pringXing(int m, int n) {
        for (int i = 1; i <= 5; i++) {
            if (i == 1 || i == 5) {
                System.out.println("**************");
            } else {
                System.out.println("*            *");
            }
            for (int j = 1; j <= 5; j++) {

            }

        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的想法:(1~9)");
        int a = sc.nextInt();
        //调用
        printNN(9);
    }

    public static void printNN(int a) {
        for (int x = 1; x <= a; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + "*" + x + "=" + y * x + "\t");
            }
            System.out.println();
        }
    }
}