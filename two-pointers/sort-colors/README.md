# Sort Colors

Sort an array containing only `0`, `1`, and `2` in-place.

## 📌 Key Idea

Maintain three pointers:

* `low` → boundary for `0`s
* `mid` → current element being processed
* `high` → boundary for `2`s

As the array is traversed, elements are placed into their correct region using swaps.

## 📌 Why this approach

A straightforward solution would sort the array using a general sorting algorithm.

Since the array contains only three distinct values, the array can be partitioned directly in a single pass without performing a full sort.

## 📌 Pattern

Two Pointers → Dutch National Flag Algorithm

## 📌 Complexity

* Time: `O(n)`
* Space: `O(1)`

## 📌 Notes

The important detail is that when a `2` is swapped with the `high` pointer, the new value at `mid` has not been processed yet.

For that reason, `mid` is not incremented after swapping with `high`.

This allows every element to be examined exactly once while maintaining the three partitions.
