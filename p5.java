public class p5 {
  public static void main(String[] args) {
    for(int i=1;i<=7;i++){
      for(int j=1;j<=7;j++){
        if((i==j&&j<=3)||(i+j==8&&j>4)||(j==4&&i>3)){
          System.out.print(" *");
        }
        else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}