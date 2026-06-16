# Permutation in String

Determine whether a permutation of one string exists as a substring of another string.

## 📌 Key Idea

Maintain a fixed-size sliding window equal to the length of `s1`.

Store the character frequencies of `s1` and compare them with the frequencies of the current window in `s2`.

If both frequency arrays match, the current window is a valid permutation.

## 📌 Why this approach

Checking every substring independently would repeatedly count character frequencies.

Using a fixed-size sliding window allows the frequency counts to be updated incrementally as the window moves, avoiding repeated work.

## 📌 Pattern

Sliding Window → Fixed-Size Window + Frequency Counting

## 📌 Complexity

* Time: `O(n)`
* Space: `O(1)`

> The frequency arrays always contain 26 lowercase English letters.

## 📌 Notes

The window size never changes because every valid permutation must have the same length as `s1`.

As the window slides, only two frequency updates are required:

* add the incoming character
* remove the outgoing character

This keeps each window update constant time.
