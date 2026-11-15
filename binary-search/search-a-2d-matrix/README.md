# Search a 2D Matrix

Search for a target value in a 2D matrix where each row is sorted and the first element of each row is greater than the last element of the previous row.

## 📌 Key Idea

Treat the 2D matrix as a flattened 1D sorted array and apply binary search without actually creating another array.

The virtual 1D array has `rows * cols` elements.

For every middle index, calculate its corresponding matrix coordinates:

- `row = mid / cols`
- `col = mid % cols`

Compare `matrix[row][col]` with the target:

- If equal, return `true`.
- If smaller, search the right half.
- If greater, search the left half.

If the search range becomes empty, return `false`.

## 📌 Why this approach

The matrix follows a globally sorted order when viewed as a flattened array.

This allows standard binary search to work directly on the matrix.

Using index-to-coordinate conversion avoids the need for an additional flattened array.

## 📌 Pattern

Binary Search → 2D Matrix Search → Index Mapping

## 📌 Complexity

- Time: `O(log(m × n))` — binary search over all matrix elements.
- Space: `O(1)` — no additional data structure is created.

## 📌 Notes

- Integer division (`mid / cols`) determines the row.
- Modulo (`mid % cols`) determines the column.
- This approach depends on the matrix being globally sorted across rows, not merely having individually sorted rows.
- Assumes the matrix is non-empty and contains at least one column.
