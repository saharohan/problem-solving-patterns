# Find Minimum in Rotated Sorted Array

Find the minimum element in an array that was originally sorted in ascending order and then rotated at an unknown pivot.

## 📌 Key Idea

Use binary search to identify the portion of the rotated array containing the minimum element.

Maintain two pointers:

- `low` represents the beginning of the search range.
- `high` represents the end of the search range.

Compare the middle element with the rightmost element:

- If `nums[mid] > nums[high]`, the minimum must be in the right half. Move `low` to `mid + 1`.
- Otherwise, the minimum is at `mid` or somewhere in the left half. Move `high` to `mid`.

Continue until `low` and `high` converge.

The element at `low` is the minimum.

## 📌 Why this approach

A rotated sorted array consists of two individually sorted portions.

Comparing the middle element with the rightmost element helps determine which portion contains the rotation point and therefore the minimum element.

This allows binary search to eliminate approximately half of the search space in each iteration.

## 📌 Pattern

Binary Search → Rotated Sorted Array → Minimum Element Search

## 📌 Complexity

- Time: `O(log n)` — the search space is halved in each iteration.
- Space: `O(1)` — constant auxiliary space.

## 📌 Notes

- Use `high = mid` rather than `mid - 1` when `nums[mid] <= nums[high]`, because the middle element itself could be the minimum.
- The loop condition is `low < high` because the search ends when both pointers converge.
- This approach assumes all elements are distinct, as specified in the standard problem constraints.
