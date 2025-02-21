public class P20_AlphaA {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=9;j++){
                if (i+j==6||j-i==4||(j>2&&j<8&&i==3)) {
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
