# Longest Consecutive Sequence

Find the length of the longest sequence of consecutive integers in an unsorted array.

## 📌 Key Idea

Store all numbers in a `HashSet` for constant-time lookups.

Only start building a sequence when the current number is the beginning of a sequence, meaning `num - 1` does not exist in the set.

From there, keep expanding until the sequence ends.

## 📌 Why this approach

A brute-force approach would repeatedly search for consecutive numbers, resulting in unnecessary work.

Using a `HashSet` allows each number to be processed efficiently while ensuring that every sequence is explored only once.

## 📌 Pattern

Arrays & Hashing → HashSet Lookup

## 📌 Real-world application

Useful when identifying continuous ranges within unordered data.

Examples:

* detecting continuous activity periods
* finding consecutive IDs or sequence numbers
* analyzing uninterrupted event ranges

## 📌 Complexity

* Time: `O(n)`
* Space: `O(n)`

## 📌 Notes

The important optimization is to start counting only from the beginning of a sequence.

Checking `num - 1` avoids reprocessing numbers that already belong to an existing sequence, keeping the solution linear.
