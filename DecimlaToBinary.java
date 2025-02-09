public class DecimlaToBinary {
    public static void main(String[] args) {
        decimalToBinary(7);
        decimalToBinary(10);
    }
    public static void decimalToBinary(int n){
        int myNum=n;
        int pow=0;
        int binNum=0;
        while(n>0){
            int rem=n%2;
            binNum+=(rem*Math.pow(10, pow));
            pow++;
            n/=2;
        }
        System.out.println("Binary of "+myNum+" = "+binNum);
    }
}
