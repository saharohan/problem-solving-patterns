# Largest Rectangle in Histogram

Find the largest rectangular area that can be formed within a histogram, where each bar has a width of 1.

## 📌 Key Idea

Use a monotonic increasing stack to track indices of histogram bars in increasing height order.

Traverse the histogram from left to right.

- Push the current index onto the stack while maintaining increasing height order.
- When the current height is smaller than the height at the stack's top, pop the previous index.
- The popped bar becomes the limiting height of a potential rectangle.
- Calculate the rectangle's width using the current index as the right boundary and the new stack top as the left boundary.
- Update the maximum area.

Append a virtual bar of height `0` at the end to ensure all remaining bars are processed.

## 📌 Why this approach

A brute-force approach considers multiple ranges of bars and can take `O(n²)` time.

A monotonic stack efficiently identifies the nearest smaller bar on both sides of each histogram bar.

When a bar is popped, its maximum possible rectangle width is known because both boundaries have been established.

Each index is pushed and popped at most once, resulting in linear time complexity.

## 📌 Pattern

Stack → Monotonic Increasing Stack → Nearest Smaller Element

## 📌 Complexity

- Time: `O(n)` — each index is pushed and popped at most once.
- Space: `O(n)` — the stack can store up to `n` indices.

## 📌 Notes

- Store indices rather than heights to calculate rectangle widths.
- When the stack becomes empty after popping, the rectangle extends from index `0` to `i - 1`, giving a width of `i`.
- Otherwise, the width is `i - stack.peek() - 1`.
- The virtual zero-height bar flushes all remaining indices from the stack.
