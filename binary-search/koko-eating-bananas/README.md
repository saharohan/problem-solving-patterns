# Koko Eating Bananas

Find the minimum eating speed `k` at which Koko can finish all banana piles within `h` hours.

## 📌 Key Idea

Use binary search on the possible eating speeds.

The minimum possible speed is `1`, and the maximum possible speed is the size of the largest pile.

For each candidate speed `mid`, calculate the total hours required to finish all piles.

For each pile, the required hours are:

`(pile + mid - 1) / mid`

This performs ceiling division using integer arithmetic.

- If the total hours are less than or equal to `h`, the speed is feasible. Search for a smaller speed by moving `high` to `mid`.
- If the total hours exceed `h`, the speed is too slow. Increase the minimum speed by moving `low` to `mid + 1`.

Continue until `low` and `high` converge.

The final `low` represents the minimum feasible eating speed.

## 📌 Why this approach

The feasibility of a speed is monotonic:

- If Koko can finish within `h` hours at a particular speed, any higher speed is also feasible.
- If Koko cannot finish at a particular speed, any lower speed is also infeasible.

This monotonic property allows binary search over the answer space.

## 📌 Pattern

Binary Search → Binary Search on Answer → Monotonic Feasibility

## 📌 Complexity

Let `n` be the number of piles and `M` be the maximum pile size.

- Time: `O(n log M)` — each binary-search iteration checks all piles.
- Space: `O(1)` — constant auxiliary space.

## 📌 Notes

- The search range is `[1, max(piles)]`.
- Use ceiling division to account for partially consumed piles requiring a full hour.
- Use `high = mid` when the candidate speed is feasible because the current speed might be the minimum answer.
- The algorithm assumes the input satisfies the problem constraints, including `h >= piles.length`.
