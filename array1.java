public class array1 {
    public static void main(String[] args) {
        int arr[]={3,7,8,2,5,6,4};
        //1
        int n=arr[arr.length-1];
        for(int i=1;i<=10;i++){
            System.out.println(n+"X"+i+"="+n*i);
        }
        //2
        int mid=arr.length/2;
        System.out.println("mid value="+arr[mid]);
        //3
        int arr1[]={3,7,8,2,9,5,6,4};
        int mid1=arr1.length/2;
        int mid2=(arr1.length/2)-1;
        System.out.println("Sum of middle elements="+(mid1+mid2));
        //3
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
        //4
        for(int k=arr.length-1;k>=0;k--){
            System.out.println(arr[k]);
        }
        //5
        for(int a=0;a<arr.length;a++){
            if(arr[a]%2==0){
                System.out.println(arr[a]);
            }
        }
        //6
        int count=0;
        for(int b=0;b<arr.length;b++){
            if(arr[b]%2!=0){
                count++;
            }
        }
        System.out.println("count="+count);
        //7
        int sum=0;
        for(int c=0;c<arr.length;c++){
            sum+=arr[c];
        }
        System.out.println("sum="+sum);
    }
}
