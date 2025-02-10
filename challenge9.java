import java.util.*;
public class challenge9{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the no of integers:");
            int num=input.nextInt();
            int sumEven=0;
            int sumOdd=0;
            for(int i=0;i<num;i++){
                System.out.print("Enter the "+i+" element:");
                int n=input.nextInt();
                if(n%2==0){
                    sumEven+=n;
                }
                if(n%2!=0){
                    sumOdd+=n;
                }
            }
            System.out.println("Sum of even elements are: "+sumEven);
            System.out.println("Sum of odd elements are: "+sumOdd);
        }
    }
}