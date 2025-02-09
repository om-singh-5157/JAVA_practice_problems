public class BinaryToDecimal {
    public static void main(String[] args) {
        binaryToDecimal(101);
        binaryToDecimal(110);
        binaryToDecimal(1111);
    }
    public static void binaryToDecimal(int n){
        int myNum=n;
        int pow=0;
        int decimal=0;
        while(n>0){
            int lastDigit=n%10;
            decimal+=(lastDigit*(int)Math.pow(2,pow));
            pow++;
            n/=10;
        }
        System.out.println("Decimal of "+myNum+" = "+decimal);
    }
}
