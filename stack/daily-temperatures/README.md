# Daily Temperatures

For each day, find how many days must pass until a warmer temperature occurs. If no warmer day exists, the answer is `0`.

## 📌 Key Idea

Use a monotonic decreasing stack to track indices of days whose next warmer temperature has not yet been found.

Traverse the temperature array from left to right.

- Push the current index onto the stack.
- Before pushing, compare the current temperature with the temperature at the index on top of the stack.
- If the current temperature is higher, pop the previous index.
- Calculate the waiting days using `currentIndex - previousIndex` and store the result in the answer array.
- Continue popping while the current temperature is warmer than the temperatures represented by the stack.

Indices remaining in the stack have no warmer temperature to their right, so their answer remains `0`.

## 📌 Why this approach

A brute-force approach checks every future day for each temperature, resulting in `O(n²)` time complexity.

A monotonic stack avoids repeated comparisons by keeping unresolved indices in decreasing temperature order.

Each index is pushed onto the stack once and popped at most once, resulting in linear time complexity.

## 📌 Pattern

Stack → Monotonic Decreasing Stack → Next Greater Element

## 📌 Complexity

- Time: `O(n)` — every index is pushed and popped at most once.
- Space: `O(n)` — the stack can store up to `n` indices, excluding the answer array.

## 📌 Notes

- Store indices rather than temperature values because the answer requires the distance between two days.
- Use `>` rather than `>=` because the problem asks for a strictly warmer temperature.
- Any indices remaining in the stack have no warmer day ahead, so their answers remain `0`.
