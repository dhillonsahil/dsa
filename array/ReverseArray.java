package array;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("Before revserse ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        reverse(arr);
        System.out.println();
        System.out.println("After revserse ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp =arr[end];
            arr[end]= arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }
    
}


// Time Complexity - O(n)