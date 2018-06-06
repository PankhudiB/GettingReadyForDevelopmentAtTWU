import java.util.Scanner;

public class RightTriangle{

    public static void printRightTriangle(int n)
    {
        for(int row = 1; row <= n; row++) {
            for (int col = row; col > 0; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        printRightTriangle(n);
    }

}