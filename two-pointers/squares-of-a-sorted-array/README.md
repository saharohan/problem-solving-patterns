# Squares of a Sorted Array

Return an array containing the squares of each number in sorted order.

## 📌 Key Idea

Use two pointers starting from both ends of the array.

The largest square will always come from either the leftmost negative number or the rightmost positive number.

Compare both squares and place the larger one at the end of the result array.

## 📌 Why this approach

Squaring the values directly breaks the original ordering because negative numbers become positive.

A simple square-and-sort solution would require `O(n log n)` time.

Using two pointers allows the result to be built in sorted order during a single pass.

## 📌 Pattern

Two Pointers → Opposite Direction Traversal

## 📌 Complexity

* Time: `O(n)`
* Space: `O(n)`

## 📌 Notes

The key observation is that the largest square must come from one of the array ends.

Building the result array from right to left avoids the need for an additional sorting step.
