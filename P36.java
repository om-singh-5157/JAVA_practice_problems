public class P36 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=5;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k=4;k>=1;k--){
            for(int j=1;j<=k;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
