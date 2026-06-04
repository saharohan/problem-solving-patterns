# Product of Array Except Self

Return an array where each element is the product of all elements in the input array except itself.

## 📌 Key Idea

Build prefix products from left to right and suffix products from right to left.

For each index:

* prefix product represents all elements before it
* suffix product represents all elements after it

Multiplying both gives the required result without using division.

## 📌 Why this approach

A brute-force solution would calculate the product for every index separately, resulting in `O(n²)` complexity.

Using prefix and suffix products allows the result to be built in linear time while avoiding division.

## 📌 Pattern

Arrays & Hashing → Prefix and Suffix Products

## 📌 Real-world application

Useful when cumulative values need to be calculated while excluding the current element.

Examples:

* calculating aggregate metrics while excluding a specific record
* computing contribution of remaining components in a system
* deriving values from left and right cumulative data

## 📌 Complexity

* Time: `O(n)`
* Space: `O(1)` (excluding the output array)

## 📌 Notes

The result array is reused to store prefix products, avoiding additional arrays for left and right products.

This reduces extra space usage while maintaining linear time complexity.
