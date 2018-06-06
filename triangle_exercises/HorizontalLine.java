import java.util.Scanner;

public class HorizontalLine{
    public static void printHorizontalLine(int n)
    {
        for(int i=0; i<n; i++)
        {
            System.out.print("*");
        }
    }
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        printHorizontalLine(n);
    }
}