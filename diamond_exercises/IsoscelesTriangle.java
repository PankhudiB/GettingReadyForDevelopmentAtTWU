import java.util.Scanner;

public class IsoscelesTriangle{

    public static void printIsoscelesTriangle(int rows)
    {
        int stars = 1;
        int spaces =  rows - 1;
        for(int i = 1; i <= rows; i++) {
            for (int s = 0; s < spaces; s++ ) {
                System.out.print(" ");
            }
            for(int j = 0; j < stars; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            stars += 2;
            spaces--;
        }
    }

    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        printIsoscelesTriangle(n);
    }

}