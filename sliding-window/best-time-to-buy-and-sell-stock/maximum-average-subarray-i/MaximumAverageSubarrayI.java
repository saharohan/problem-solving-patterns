class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        for (int right = k; right < nums.length; right++) {

            windowSum =
                windowSum
                - nums[right - k]
                + nums[right];

            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }
}
