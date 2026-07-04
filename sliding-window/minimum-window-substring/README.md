# Minimum Window Substring

Find the smallest substring of `s` that contains all characters of `t`.

## 📌 Key Idea

Maintain a variable-size sliding window and track the remaining characters required to form the target string.

Expand the window until all required characters are included.

Once the window becomes valid, shrink it from the left while preserving validity to find the smallest possible window.

## 📌 Why this approach

A brute-force solution would examine every possible substring and repeatedly verify whether it contains all required characters.

Using a sliding window with character frequency tracking allows the window to expand and contract efficiently, producing a linear-time solution.

## 📌 Pattern

Sliding Window → Variable-Size Window + Frequency Counting

## 📌 Complexity

* Time: `O(n)`
* Space: `O(1)`

> The frequency array has a fixed size of 128 ASCII characters.

## 📌 Notes

The required variable tracks how many characters are still needed to form a valid window.

A window is valid only when required == 0.

The algorithm alternates between:

* expanding the window until it becomes valid
* shrinking the window to find the minimum valid substring

This expand-then-shrink strategy is a common pattern in advanced sliding window problems.
