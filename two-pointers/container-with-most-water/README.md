# Container With Most Water

Find two lines that together form a container capable of holding the maximum amount of water.

## 📌 Key Idea

Use two pointers starting from both ends of the array.

At each step:

* calculate the area formed by the current container
* update the maximum area if needed
* move the pointer with the smaller height inward

This ensures that only potentially better containers are explored.

## 📌 Why this approach

A brute-force solution would evaluate every possible pair of lines, resulting in `O(n²)` complexity.

Using two pointers allows the search space to be reduced intelligently, producing the result in a single pass.

## 📌 Pattern

Two Pointers → Opposite Direction Traversal

## 📌 Complexity

* Time: `O(n)`
* Space: `O(1)`

## 📌 Notes

The area is limited by the shorter of the two lines.

Moving the taller line cannot increase the container height, so only the shorter line is moved in search of a potentially taller boundary and a larger area.
