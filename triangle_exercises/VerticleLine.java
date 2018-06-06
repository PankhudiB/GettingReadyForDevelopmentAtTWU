import java.util.Scanner;

public class VerticleLine{
    public static void printVerticleLine(int n)
    {
        for(int i=0; i<n; i++)
        {
            System.out.println("*");
        }
    }
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        printVerticleLine(n);
    }
}