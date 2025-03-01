
import java.util.Scanner;

class Area {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the base:");
        double b=input.nextInt();
        System.out.print("Enter the height:");
        double h=input.nextInt();
        System.out.println("Area of ur triangle is = "+((b*h)/2));
    }
}
