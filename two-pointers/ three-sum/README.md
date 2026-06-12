# 3Sum

Find all unique triplets in the array whose sum equals zero.

## 📌 Key Idea

Sort the array and fix one element at a time.

For each fixed element, use two pointers to search for the remaining two values that complete the target sum.

Duplicate values are skipped to ensure only unique triplets are added to the result.

## 📌 Why this approach

A brute-force solution would check every possible triplet, resulting in `O(n³)` complexity.

Sorting the array allows the remaining two values to be found efficiently using the two-pointer technique, reducing the overall complexity.

## 📌 Pattern

Two Pointers → Fixed Element + Opposite Direction Traversal

## 📌 Complexity

* Time: `O(n²)`
* Space: `O(1)` (excluding the output list)

## 📌 Notes

Sorting serves two purposes:

* enables the two-pointer search
* makes duplicate handling straightforward

Skipping duplicate values for the fixed element, left pointer, and right pointer ensures that only unique triplets are included in the result.
