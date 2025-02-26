public class P37 {
    public static void main(String[] args) {
        // int k=1;
        // for(int i=5;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(k++%2);
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j%2);
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i%2);
        //     }
        //     System.out.println();
        // }
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i%2);
            }
            System.out.println();
        }
    }
}
