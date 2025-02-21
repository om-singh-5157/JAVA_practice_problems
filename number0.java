public class number0 {
    public static void main(String[] args) {
       for(int i=1;i<=7;i++){
            for(int j=1;j<=13;j++){
                if(i==2||i==6||i+j==8&&i<=5||j-i==6&&i<=5||i-j==0&&i>=3||i+j==14&&i>=3)
                    System.out.print("+");
                else{
                    System.out.print(" ");
                }
            }
  
            System.out.println();
            
       }
  
    }
  }