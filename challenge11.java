public class challenge11 {
    public static void main(String[] args) {
        System.out.println("Sum is= "+sumOfDigits(4321));
    }
    public static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            int lastDigit=n%10;
            sum+=lastDigit;
            n/=10;
        }
        return sum;
    }
}
