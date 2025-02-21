public class P15_Digit1 {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int j=1;j<=5;j++){
                if (i+j==4||j==3||i==7) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
