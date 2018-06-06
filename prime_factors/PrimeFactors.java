import java.util.Scanner;
import java.util.ArrayList;

public class PrimeFactors{
    public static ArrayList<Integer> printPrimeFactor(int n)
    {
        int i=2;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(n>1) {
            if (n % i == 0) {
                list.add(i);
                n = n / i;
            } else
                i++;
        }
        return list;
    }
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        ArrayList<Integer> result = printPrimeFactor(n);
        for(int item : result)
        {
            System.out.print(item + " ");
        }
    }
}

