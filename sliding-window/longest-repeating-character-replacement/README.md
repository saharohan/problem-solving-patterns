# Longest Repeating Character Replacement

Find the length of the longest substring that can be transformed into a string of repeating characters using at most `k` replacements.

## 📌 Key Idea

Maintain a variable-size sliding window and track the frequency of characters within it.

Keep the frequency of the most common character (`maxFreq`) in the current window.

If the number of characters that need replacement exceeds `k`, shrink the window from the left.

## 📌 Why this approach

A brute-force solution would examine every possible substring and calculate the required replacements repeatedly.

Using a sliding window allows the window to grow and shrink dynamically while maintaining the required information, resulting in a linear-time solution.

## 📌 Pattern

Sliding Window → Variable-Size Window

## 📌 Complexity

* Time: `O(n)`
* Space: `O(1)`

> The frequency array has a fixed size of 26 uppercase English letters.

## 📌 Notes

The key observation is that the number of replacements needed for the current window is:

`window size - frequency of the most common character`

If this value exceeds `k`, the window is no longer valid and must be shrunk.

The stored `maxFreq` is never decreased. Even if it becomes slightly outdated, the algorithm remains correct while avoiding unnecessary recomputation.
