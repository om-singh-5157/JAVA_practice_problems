public class ArrayOperations {
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        // pairs(arr);
        // subArrays(arr);
        max_subArrays_3(arr);
        
    }
    public static void max_subArrays_3(int arr[]){      //kadanes (O(n))
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
            if(max<sum){
                max=sum;
            }
        }
        if(max==0){
            
        }
        System.out.println("maximum of subarray is = "+max);
    }
    public static void max_subArrays_2(int arr[]){    //prefix sum(O(n*2))
        int sum=0;
        int max=Integer.MIN_VALUE;
        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum = i==0 ? prefix[j]: prefix[j]-prefix[i-1];
            }
            if(max<sum){
                max=sum;
            }
        }
        System.out.print("maximum of subarray is = "+max);
    }
    public static void max_subArrays_1(int arr[]){   //brute force(O(n*3))
        int sum;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print("{");
                sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+",");
                    sum+=arr[k];
                }
                if(max<sum){
                    max=sum;
                }
                System.out.print("}=");
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        System.out.println("maximum sum of subarray is = "+max);
    }
    public static void subArrays(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print("{");
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+",");
                }
                System.out.print("} ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs = "+tp);
    }
    public static void pairs(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs = "+tp);
    }
    public static int binarySearch(int arr[],int key){
        int start=0 , end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){   //right
                start=mid+1;
            }
            else{               //left
                end=mid-1;
            }
        }
        return -1;
    }
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
