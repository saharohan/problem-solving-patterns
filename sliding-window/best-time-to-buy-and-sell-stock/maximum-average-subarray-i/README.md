# Maximum Average Subarray I

Find the maximum average value of any contiguous subarray of size `k`.

## 📌 Key Idea

Maintain a fixed-size sliding window of length `k`.

Calculate the sum of the first window, then slide the window one element at a time by removing the outgoing element and adding the incoming element.

Track the maximum window sum throughout the traversal.

## 📌 Why this approach

A brute-force solution would calculate the sum of every subarray of size `k`, resulting in repeated work.

A sliding window reuses the previous window sum, allowing each new window to be computed in constant time.

## 📌 Pattern

Sliding Window → Fixed-Size Window

## 📌 Complexity

* Time: `O(n)`
* Space: `O(1)`

## 📌 Notes

The key optimization is updating the window sum incrementally instead of recalculating it for every window.

Subtract the element leaving the window and add the new element entering the window, keeping each slide an `O(1)` operation.
