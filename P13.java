public class P13 {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int j=1;j<=13;j++){
                if (i==6||(i<6&&i+j==8)||(i<6&&j-i==6)||i==2||(i>2&&i==j)||(i>2&&i+j==14)) {
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
