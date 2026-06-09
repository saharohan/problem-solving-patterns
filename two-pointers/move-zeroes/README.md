# Move Zeroes

Move all zeroes to the end of the array while maintaining the relative order of non-zero elements.

## 📌 Key Idea

Use two pointers:

* a read pointer to scan the array
* a write pointer to track where the next non-zero element should be placed

Whenever a non-zero element is found, swap it into the write position and advance the write pointer.

## 📌 Why this approach

A brute-force approach might repeatedly shift elements whenever a zero is encountered.

Using two pointers allows the array to be rearranged in a single pass while preserving the order of non-zero elements.

## 📌 Pattern

Two Pointers → Read / Write Pointer

## 📌 Complexity

* Time: `O(n)`
* Space: `O(1)`

## 📌 Notes

The write pointer always represents the position where the next non-zero element belongs.

By swapping only when a non-zero element is encountered, the solution remains in-place and preserves the relative ordering of elements.
