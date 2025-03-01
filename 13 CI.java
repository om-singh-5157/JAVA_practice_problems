
import java.util.Scanner;

class CI {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the principle:");
        double P= input.nextInt();
        System.out.print("Enter the rate:");
        double R= input.nextInt();
        System.out.print("Enter the time:");
        double T= input.nextInt();
        double C=P*Math.pow((1+R/100), T);
        System.out.print("Compound interest is = "+C);
    }   
}
