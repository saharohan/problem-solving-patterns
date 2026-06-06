# Majority Element

Find the element that appears more than ⌊n / 2⌋ times in the array.

## 📌 Key Idea

Maintain a candidate and a counter.

When the counter becomes zero, choose the current element as the new candidate.

Matching elements increase the count, while different elements decrease it.

By the end of the traversal, the remaining candidate is the majority element.

## 📌 Why this approach

A frequency map would solve the problem using additional space.

The Boyer-Moore Voting Algorithm identifies the majority element in a single pass while using constant extra space.

## 📌 Pattern

Arrays → Boyer-Moore Voting Algorithm

## 📌 Complexity

* Time: `O(n)`
* Space: `O(1)`

## 📌 Notes

The core idea is that majority elements cannot be fully cancelled out by non-majority elements.

Every mismatch removes one occurrence of the candidate and one occurrence of a different element. Since the majority element appears more than half the time, it survives the cancellation process.
