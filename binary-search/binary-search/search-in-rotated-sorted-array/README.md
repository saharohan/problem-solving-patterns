# Search in Rotated Sorted Array

Find the index of a target element in a rotated sorted array of distinct integers. Return `-1` if the target is not present.

## 📌 Key Idea

Use modified binary search to identify the sorted half of the rotated array.

At each iteration:

1. Calculate the middle index and check whether the target is found.
2. Determine which half is sorted by comparing `nums[low]` with `nums[mid]`.
3. Check whether the target lies within the sorted half.
4. If it does, continue searching that half. Otherwise, search the other half.

**Left half is sorted** when:

`nums[low] <= nums[mid]`

- If the target lies between `nums[low]` and `nums[mid]`, move `high` to `mid - 1`.
- Otherwise, move `low` to `mid + 1`.

**Right half is sorted** when:

`nums[low] > nums[mid]`

- If the target lies between `nums[mid]` and `nums[high]`, move `low` to `mid + 1`.
- Otherwise, move `high` to `mid - 1`.

Continue until the target is found or the search range becomes empty.

## 📌 Why this approach

A rotated sorted array consists of two individually sorted portions.

Even though the entire array is not sorted, at least one half around the middle is always sorted.

Identifying that sorted half allows us to determine whether the target can exist within it and eliminate the other half.

## 📌 Pattern

Binary Search → Modified Binary Search → Rotated Sorted Array

## 📌 Complexity

- Time: `O(log n)` — the search space is halved in each iteration.
- Space: `O(1)` — constant auxiliary space.

## 📌 Notes

- Use `nums[low] <= nums[mid]` to identify the sorted left half.
- Use inclusive and exclusive boundary comparisons carefully to avoid eliminating a valid target.
- This approach assumes all elements are distinct, as specified in the standard problem constraints.
