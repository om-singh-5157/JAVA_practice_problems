public class CharacterPattern {
    public static void main(String[] args) {
        int n=10;
        char ch='A';
        int i=0;
        while(i<n){
            int j=0;
            while(j<=i){
                System.out.print(ch);
                ch++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
