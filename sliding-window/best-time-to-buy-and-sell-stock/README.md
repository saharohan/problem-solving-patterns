# Best Time to Buy and Sell Stock

Find the maximum profit that can be achieved by buying and selling a stock once.

## 📌 Key Idea

Track the minimum price seen so far while iterating through the array.

For each price:

* treat it as a potential selling price
* calculate the profit using the minimum buying price seen earlier
* update the maximum profit if a better opportunity is found

## 📌 Why this approach

A brute-force solution would compare every buy and sell combination, resulting in `O(n²)` complexity.

Tracking the minimum price while traversing the array allows the maximum profit to be calculated in a single pass.

## 📌 Pattern

Sliding Window → Running Minimum

## 📌 Real-world application

Useful when identifying the best outcome from a sequence of changing values.

Examples:

* finding the best buy/sell opportunity
* tracking maximum gain over time
* identifying the largest improvement from historical data

## 📌 Complexity

* Time: `O(n)`
* Space: `O(1)`

## 📌 Notes

The key observation is that the optimal selling decision depends only on the lowest price seen before the current day.

Instead of checking all combinations, the solution continuously maintains the best buying opportunity seen so far.
