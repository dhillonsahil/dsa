package array;

public class SubArray {
    public static void main(String[] args) {
        int arr[]= {2,4,6,8,10};
        int maxSum=Integer.MIN_VALUE;

        int sum=0;

         // print sub array
         for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] + " ,");;
                }
                System.out.println();
                }
            
         }
    }    
}

// time complexity :- O(n^3)