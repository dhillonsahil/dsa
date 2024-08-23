package array;

public class SubArraySumPrefix {
    public static void main(String[] args) {
        
        int nums[]={1,-2,6,-1,3};
        int currentSum=Integer.MIN_VALUE;
        int maxSum=Integer.MIN_VALUE;
        int prefixSum[] = new int[nums.length];

        prefixSum[0]=nums[0];

        for(int i=1;i<prefixSum.length;i++){
            prefixSum[i]=prefixSum[i-1]+nums[i];
        }

        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=i;j<nums.length;j++){
                int end=j;
                currentSum=start==0?prefixSum[end]:prefixSum[end]-prefixSum[start-1];
                if(maxSum<currentSum)maxSum=currentSum;
            }
        }

        System.out.println("maximum subarray sum is : "+ maxSum);
    }
}
