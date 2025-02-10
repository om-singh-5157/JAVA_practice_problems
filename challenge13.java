
import java.util.Arrays;

public class challenge13 {
    public static void main(String[] args) {
        // int arr1[]={1,2,3,1};
        // int arr2[]={1,2,3,4,};
        // int arr3[]={1,1,1,3,3,4,3,2,4,2};
        // System.out.println(duplicateValues(arr1));
        // System.out.println(duplicateValues(arr2));
        // System.out.println(duplicateValues(arr3));

        // int arr4[]={0,1,2,4,5,6,7};
        // System.out.println(rotateAndTarget(arr4, 3,0));
        
        int arr5[]={-1,0,1,2,-1,-4};
        triplets(arr5);
    }
    public static void triplets(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.print("["+arr[i]+","+arr[j]+","+arr[k]+"]");                        
                    }
                }
            }
        }
    }
    public static int rotateAndTarget(int[] arr,int index,int target){
        int index1=index;
        int n=arr.length;
        int[] arr1=new int[n];
        int j=0;
        for(int i=0;i<index;i++){
            arr1[n-index1]=arr[i];
            index1--;
        }
        for(int i=index;i<n;i++){
            arr1[j]=arr[i];
            j++;
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]);
        }
        System.out.println();
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static boolean duplicateValues(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
