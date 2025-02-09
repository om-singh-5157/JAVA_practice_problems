public class BinomialCoefficient{
    public static void main(String[] args) {
        System.out.println("Coefficent is: "+binomialCo(5, 2));
        System.out.println("Coefficent is: "+binomialCo(4, 2));
    }
    public static int binomialCo(int n,int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    } 
}