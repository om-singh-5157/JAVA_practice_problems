
import java.util.Scanner;

class Arithmetic {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter first no.:");
        int x= input.nextInt();
        System.out.print("Enter second no.:");
        int y= input.nextInt();
        System.out.println("sum = "+(x+y));
        System.out.println("sub = "+(x-y));
        System.out.println("mul = "+(x*y));
        System.out.println("div = "+(x/y));
        // System.out.println("mod = "+(x%y));
    }
}
