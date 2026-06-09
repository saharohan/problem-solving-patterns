# Two Sum II - Input Array Is Sorted

Find two numbers in a sorted array whose sum equals the target value.

## 📌 Key Idea

Use two pointers starting from both ends of the array.

If the current sum is smaller than the target, move the left pointer to increase the sum.

If the current sum is larger than the target, move the right pointer to decrease the sum.

Continue until the target sum is found.

## 📌 Why this approach

A brute-force solution would check every pair, resulting in `O(n²)` complexity.

Since the array is already sorted, pointer movements can be used to eliminate unnecessary comparisons and find the answer in a single pass.

## 📌 Pattern

Two Pointers → Opposite Direction Traversal

## 📌 Complexity

* Time: `O(n)`
* Space: `O(1)`

## 📌 Notes

The sorted property of the array is the key observation.

Moving the left pointer always increases the sum, while moving the right pointer always decreases it, allowing the search space to shrink efficiently.
