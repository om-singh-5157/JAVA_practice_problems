public class P33 {
    public static void main(String[] args) {
        int k=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(k>9){
                    k=1;
                }
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
        int c=1;
        for(int l=5;l>=1;l--){
            for(int j=1;j<=l;j++){
                if(c>9){
                    c=1;
                }
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
