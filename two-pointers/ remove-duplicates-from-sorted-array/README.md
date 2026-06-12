# Remove Duplicates from Sorted Array

Remove duplicates from a sorted array in-place and return the number of unique elements.

## 📌 Key Idea

Use a write pointer to track the position of the next unique element.

Traverse the array with a read pointer and copy values only when a new unique element is encountered.

## 📌 Why this approach

A brute-force approach might require shifting elements whenever a duplicate is found.

Since the array is already sorted, duplicates appear next to each other, making it possible to identify unique values in a single pass.

## 📌 Pattern

Two Pointers → Read / Write Pointer

## 📌 Complexity

* Time: `O(n)`
* Space: `O(1)`

## 📌 Notes

The sorted property of the array is the key observation.

Because duplicates are adjacent, comparing the current value with the previous value is enough to determine whether a new unique element has been found.

The write pointer always represents the position where the next unique value should be placed.
