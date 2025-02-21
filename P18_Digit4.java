public class P18_Digit4 {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if ((i<6&&i+j==6)||j==5||i==5) {
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
