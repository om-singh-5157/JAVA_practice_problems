
import java.util.Scanner;

class PerimeterRec {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the length:");
        double l=input.nextInt();
        System.out.print("Enter the breadth:");
        double b=input.nextInt();
        System.out.println("Perimeter of ur rectangle is = "+(2*(l+b)));
        //jbb
    }
}
