package array;


public class BinarySearch {
    public static void main(String args[]){
        int arr[]= {12,15,23,45,56,67,78,89};
        int target = 23;
        int result = search(arr, target);
        System.out.println(result);
    }
    public static int search(int nums[],int target){
        int start= 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start + end )/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }
        }

        return -1;
    }
}

// Time Complexity - O(log2n)