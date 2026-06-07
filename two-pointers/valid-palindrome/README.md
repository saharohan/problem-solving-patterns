# Valid Palindrome

Determine whether a string is a palindrome after ignoring non-alphanumeric characters and letter casing.

## 📌 Key Idea

Use two pointers starting from both ends of the string.

Skip non-alphanumeric characters and compare the remaining characters in a case-insensitive manner.

If all valid character pairs match, the string is a palindrome.

## 📌 Why this approach

Creating a cleaned string first would require additional space.

Using two pointers allows validation to be performed directly on the original string while processing each character only when needed.

## 📌 Pattern

Two Pointers → Inward Traversal

## 📌 Complexity

* Time: `O(n)`
* Space: `O(1)`

## 📌 Notes

The important detail is handling non-alphanumeric characters before comparison.

Using two pointers avoids building an intermediate string and keeps the solution both simple and space-efficient.
