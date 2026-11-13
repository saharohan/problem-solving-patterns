# Binary Search

Find the index of a target value in a sorted array. Return `-1` if the target does not exist.

## 📌 Key Idea

Use binary search to repeatedly divide the search space into two halves.

Maintain two pointers:

- `low` represents the beginning of the search range.
- `high` represents the end of the search range.

Calculate the middle index:

`mid = low + (high - low) / 2`

Compare the middle element with the target:

- If equal, return the middle index.
- If the middle element is greater than the target, search the left half.
- If the middle element is smaller than the target, search the right half.

Continue until the target is found or the search range becomes empty.

## 📌 Why this approach

Since the array is sorted, each comparison eliminates approximately half of the remaining search space.

This makes binary search significantly more efficient than linear search for large sorted arrays.

## 📌 Pattern

Binary Search → Search in Sorted Array

## 📌 Complexity

- Time: `O(log n)` — the search space is halved in each iteration.
- Space: `O(1)` — iterative implementation uses constant auxiliary space.

## 📌 Notes

- Use `while (low <= high)` to ensure the final remaining element is checked.
- Update boundaries using `mid - 1` and `mid + 1` to avoid processing the same middle element again.
- Calculate the midpoint using `low + (high - low) / 2` to avoid potential integer overflow.
