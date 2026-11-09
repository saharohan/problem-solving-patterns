# Evaluate Reverse Polish Notation

Evaluate an arithmetic expression represented in Reverse Polish Notation (RPN).

## 📌 Key Idea

Use a stack to evaluate the expression from left to right.

- If the token is a number, convert it to an integer and push it onto the stack.
- If the token is an operator, pop the top two operands.
- Apply the operator and push the result back onto the stack.

For an operator, the first popped value is the right operand (`b`), and the second popped value is the left operand (`a`).

The final stack element contains the evaluated result.

## 📌 Why this approach

Reverse Polish Notation places operators after their operands, so parentheses and operator precedence rules are unnecessary.

A stack naturally handles this evaluation because the most recently pushed operands are the first ones used by an operator.

## 📌 Pattern

Stack → Expression Evaluation / Operand Management

## 📌 Complexity

- Time: `O(n)` — each token is processed once.
- Space: `O(n)` — the stack can hold up to `O(n)` operands.

## 📌 Notes

- Operand order matters for subtraction and division: `a - b` and `a / b`.
- Java integer division truncates toward zero.
- The input is assumed to be a valid RPN expression.
