# Merge Sorted Array

Merge two sorted arrays into a single sorted array in-place.

## 📌 Key Idea

Use two pointers starting from the end of both arrays.

Since `nums1` has extra space at the end, fill positions from right to left by placing the larger element first.

This avoids overwriting values that still need to be processed.

## 📌 Why this approach

Shifting elements from the front would require additional work and could overwrite existing values.

Processing from the end allows the merge to be completed in-place while preserving all elements.

## 📌 Pattern

Two Pointers → Backward Traversal

## 📌 Complexity

* Time: `O(m + n)`
* Space: `O(1)`

## 📌 Notes

The important observation is that the empty space already exists at the end of `nums1`.

By filling the array from right to left, elements can be placed directly into their final position without requiring an additional array.
