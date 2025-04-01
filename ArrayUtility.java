import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i=0;
        while(i<size){
            System.out.print("Enter the element no "+i+" :");
            arr[i] = input.nextInt();
            i++;
        }
        return arr; //good
    }
}
