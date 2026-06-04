# Top K Frequent Elements

Return the `k` most frequent elements from the array.

## 📌 Key Idea

Count the frequency of each number using a `HashMap`.

Use a min-heap of size `k` to keep track of the current top `k` frequent elements.

Whenever the heap size exceeds `k`, remove the element with the lowest frequency.

## 📌 Why this approach

Sorting all elements by frequency would require processing every frequency value.

Using a min-heap of size `k` ensures that only the `k` most frequent elements are maintained throughout the traversal.

This reduces unnecessary work when `k` is much smaller than the total number of unique elements.

## 📌 Pattern

Arrays & Hashing → Frequency Counting + Heap / Priority Queue

## 📌 Real-world application

Useful when identifying the most common items from a large dataset.

Examples:

* finding the most searched keywords
* identifying frequently accessed resources
* tracking the most common events or requests

## 📌 Complexity

* Time: `O(n log k)`
* Space: `O(n)`

## 📌 Notes

A min-heap is used instead of a max-heap because only the top `k` elements need to be maintained.

Whenever the heap grows beyond `k`, the least frequent element is removed, keeping the heap size fixed and efficient.
