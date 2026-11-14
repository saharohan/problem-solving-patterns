# Search Insert Position

Find the index of a target in a sorted array. If the target is not present, return the index where it should be inserted to maintain sorted order.

## 📌 Key Idea

Use binary search to locate the target or determine its correct insertion position.

Maintain two pointers:

- `low` represents the beginning of the search range.
- `high` represents the end of the search range.

Compare the middle element with the target:

- If equal, return `mid`.
- If smaller, move `low` to `mid + 1`.
- If greater, move `high` to `mid - 1`.

When the search ends, `low` points to the correct insertion position.

## 📌 Why this approach

Since the array is sorted, binary search eliminates half of the remaining search space after each comparison.

When the search range becomes empty, `low` identifies the first position where the target can be inserted without breaking the sorted order.

## 📌 Pattern

Binary Search → Lower Bound / Insertion Position

## 📌 Complexity

- Time: `O(log n)`
- Space: `O(1)`

## 📌 Notes

- Unlike standard binary search, the algorithm returns `low` when the target is absent.
- At termination, `low` is the first index whose value is greater than or equal to the target.
- If every element is smaller than the target, `low` becomes `nums.length`, representing insertion at the end.
