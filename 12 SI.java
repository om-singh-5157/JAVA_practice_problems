
import java.util.Scanner;

class SI {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the principle:");
        double P= input.nextInt();
        System.out.print("Enter the rate:");
        double R= input.nextInt();
        System.out.print("Enter the time:");
        double T= input.nextInt();
        double S=(P*R*T)/100;
        System.out.print("Simple interest is = "+S);
    }
}
