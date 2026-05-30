# Valid Anagram

Check whether two strings contain the same character frequency.

## 📌 Key Idea

Use a `HashMap` to count characters from one string and reduce counts using the second string.

If all frequencies match, the strings are anagrams.

## 📌 Why this approach

Sorting works, but takes `O(n log n)` time.

Using a frequency map reduces the problem to lookups and updates, giving an `O(n)` solution.

## 📌 Pattern

Arrays & Hashing → Frequency Counting

## 📌 Real-world application

Useful when order does not matter, but count/frequency does.

Examples:
* comparing data regardless of order
* counting repeated events or requests
* validating occurrence counts

## 📌 Complexity

* Time: `O(n)`
* Space: `O(k)`


