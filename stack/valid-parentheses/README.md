# Valid Parentheses

Determine whether a string containing brackets has valid opening and closing order.

## 📌 Key Idea

Use a `Stack` to keep track of opening brackets.

When an opening bracket is encountered, push it onto the stack.

When a closing bracket is encountered, compare it with the top element of the stack. If they match, pop the opening bracket. Otherwise, the string is invalid.

The string is valid only when all brackets are matched and the stack is empty at the end.

## 📌 Why this approach

A stack follows the Last In, First Out (LIFO) principle.

The most recently opened bracket must be the first one to close. This makes a stack suitable for validating nested bracket sequences.

## 📌 Pattern

Stack → Matching Brackets / LIFO

## 📌 Complexity

- Time: `O(n)`
- Space: `O(n)`

## 📌 Notes

Always check whether the stack is empty before accessing its top element.

A final empty-stack check is necessary because unmatched opening brackets may remain even after the entire string has been processed.
