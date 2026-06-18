# Minimum Size Subarray Sum

Find the minimum length of a contiguous subarray whose sum is greater than or equal to the target.

## 📌 Key Idea

Maintain a variable-size sliding window and keep track of its current sum.

Expand the window by moving the right pointer.

Once the window satisfies the target sum, shrink it from the left while maintaining the condition to find the smallest valid window.

## 📌 Why this approach

A brute-force solution would calculate the sum for every possible subarray, resulting in repeated work.

Using a sliding window allows the window to expand and contract dynamically while maintaining the current sum, producing an efficient linear-time solution.

## 📌 Pattern

Sliding Window → Variable-Size Window

## 📌 Complexity

* Time: `O(n)`
* Space: `O(1)`

## 📌 Notes

The important observation is that once the current window satisfies the target, expanding it further cannot produce a smaller valid answer.

Instead, shrinking the window helps identify the minimum-length subarray while preserving the required sum.
