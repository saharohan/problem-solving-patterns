# Longest Substring Without Repeating Characters

Find the length of the longest substring that contains no repeating characters.

## 📌 Key Idea

Maintain a sliding window using two pointers and a `HashSet`.

Expand the window by moving the right pointer.

If a duplicate character is encountered, shrink the window from the left until all characters are unique again.

Track the maximum window length throughout the traversal.

## 📌 Why this approach

A brute-force solution would examine every possible substring and repeatedly check for duplicate characters.

Using a sliding window ensures that each character is added and removed at most once, producing an efficient linear-time solution.

## 📌 Pattern

Sliding Window → Variable-Size Window

## 📌 Complexity

* Time: `O(n)`
* Space: `O(k)`

> `k` = number of unique characters in the current window.

## 📌 Notes

The window only shrinks when the current condition (all unique characters) is violated.

Since every character enters and leaves the window at most once, the total work remains linear despite the nested `while` loop.
