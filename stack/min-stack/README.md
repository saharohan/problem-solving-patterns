# Min Stack

Design a stack that supports `push`, `pop`, `top`, and retrieving the minimum element in constant time.

## 📌 Key Idea

Use two stacks to maintain the elements and the minimum values separately.

- `stack` stores all pushed elements.
- `minStack` stores elements that become the current minimum.

When pushing an element, add it to `minStack` if it is less than or equal to the current minimum.

When popping, compare the removed element with the top of `minStack`. If they match, remove it from `minStack` as well.

This keeps the minimum element available at the top of `minStack`.

## 📌 Why this approach

A regular stack does not provide direct access to the minimum element.

Maintaining a separate minimum stack avoids scanning all elements whenever `getMin()` is called.

Both stacks are updated together, keeping the minimum information synchronized with the main stack.

## 📌 Pattern

Stack → Auxiliary Stack / Minimum Tracking

## 📌 Complexity

- `push()`: `O(1)`
- `pop()`: `O(1)`
- `top()`: `O(1)`
- `getMin()`: `O(1)`
- Space: `O(n)`

## 📌 Notes

- Use `<=` instead of `<` when pushing into `minStack` to handle duplicate minimum values correctly.
- Remove from `minStack` only when the popped element matches its top.
- The auxiliary stack maintains the minimum values in synchronization with the main stack.
