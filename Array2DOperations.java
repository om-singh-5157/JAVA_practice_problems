public class Array2DOperations {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        // inputArray(3, 3);
        // spiralMatrix(arr1);
        // System.out.println(diagonalSum(arr));
        searchSortedMatrix(arr, 8);

    }
    public static boolean searchSortedMatrix(int arr[][],int key){
        // int row=0, col=arr[0].length-1;     //for right top cell value
        // while(row<arr.length && col>=0){
        //     if(arr[row][col]==key){
        //         System.out.print("found at index = ("+row+","+col+")");
        //         return true;
        //     }
        //     else if(key<arr[row][col]){
        //         col--;
        //     }
        //     else{
        //         row++;
        //     }
        // }
        int row=arr.length-1 , col=0;         //for left bottom cell value
        while(row>=0 && col<arr[0].length){
            if(arr[row][col]==key){
                System.out.print("found at index = ("+row+","+col+")");
                return true;
            }
            else if(key<arr[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        
        return false;
    }
    public static int diagonalSum(int[][] arr){
        int sum=0;
        // for(int i=0;i<arr.length;i++){        //O(n^2)
        //     for(int j=0;j<arr[0].length;j++){
        //         if(i==j){
        //             sum+=arr[i][j];
        //         }
        //         else if(i+j==arr.length-1){
        //             sum+=arr[i][j];
        //         }
        //     }
        // }
        for(int i=0;i<arr.length;i++){          //O(n)
            //pd
            sum+=arr[i][i];
            //sd and overlapping in odd n case
            if(i!=arr.length-1-i){
                sum+=arr[i][arr.length-1-i];
            }
        }
        return sum;
    }
    public static void spiralMatrix(int arr[][]){
        int startRow=0 , endRow=arr.length-1;
        int startCol=0 , endCol=arr[0].length-1;
        
        while(startRow<=endRow && startCol<=endCol){
            //top
        for(int j=startCol;j<=endCol;j++){
            System.out.print(arr[startRow][j]+" ");
        }
        //right
        for(int i=startRow+1;i<=endRow;i++){
            System.out.print(arr[i][endCol]+" ");
        }
        //bottom
        for(int j=endCol-1;j>=startCol;j--){
            if(startRow==endRow){
                break;
            }
            System.out.print(arr[endRow][j]+" ");
        }
        //left
        for(int i=endRow-1;i>=startRow+1;i--){
            if(startCol==endCol){
                break;
            }
            System.out.print(arr[i][startCol]+" ");
        }

        startRow++;
        startCol++;
        endRow--;
        endCol--;
        }
    }
    public static void inputArray(int n, int m){
        // Scanner input= new Scanner(System.in);
        int[][] arr=new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                // arr[i][j]=input.nextInt();
            }
        }
        printArray(arr);
    }
    public static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
