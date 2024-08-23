package array;

public class MaxSubArraySumBruteforce {
    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        int maxSum = Integer.MIN_VALUE;

        int sum = 0;

        // print sub array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (maxSum < sum)
                    maxSum = sum;
            }

        }

        System.out.println(maxSum);
    }
}

// time complexity :- O(n^3)