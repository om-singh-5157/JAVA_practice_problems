public class challenge15 {
    public static void main(String[] args) {
        int arr[][]={{1,4,9},{2,2,3}};
        int key=3;
        int row=1;
        System.out.println(noOfSameElementInMatrix(arr, key));
        System.out.println(sumOfElementsInMatrix(arr, row));
        transposeMatrix(arr);
    }
    public static void transposeMatrix(int matrix[][]){
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static int sumOfElementsInMatrix(int matrix[][],int row){ //O(m)
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            if(i==row-1){
                for(int j=0;j<matrix[0].length;j++){
                    sum+=matrix[i][j];
                }
                break;
            }
        }
        return sum;
    }
    public static int noOfSameElementInMatrix(int matrix[][],int key){ //O(m*n)
        int sameVal=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    sameVal++;
                }
            }
        }
        return sameVal;
    }
}
