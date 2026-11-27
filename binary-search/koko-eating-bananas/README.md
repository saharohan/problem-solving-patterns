\# Koko Eating Bananas

Find the minimum eating speed `k` at which Koko can finish all banana piles within `h` hours.

## 📌 Key Idea

Use binary search over the possible eating speeds.

The search range is:

- `low = 1`: minimum possible eating speed.
- `high = max(piles)`: maximum required speed, since Koko can finish any pile in one hour at this speed.

For each candidate speed `mid`, calculate the total hours required to finish all piles.

For each pile, calculate the required hours using ceiling division:

`(pile + mid - 1) / mid`

- If total hours are less than or equal to `h`, the speed is feasible. Search for a smaller speed using `high = mid`.
- If total hours exceed `h`, the speed is insufficient. Increase the speed using `low = mid + 1`.

Continue until `low` and `high` converge.

The final `low` is the minimum feasible eating speed.

## 📌 Why this approach

The feasibility of an eating speed is monotonic.

If Koko can finish all piles within `h` hours at a particular speed, any higher speed will also be feasible.

If a speed is insufficient, any lower speed will also be insufficient.

This monotonic property allows binary search over the answer space.

## 📌 Pattern

Binary Search → Binary Search on Answer → Monotonic Feasibility

## 📌 Complexity

Let `n` be the number of piles and `M` be the maximum pile size.

- Time: `O(n log M)` — each binary-search iteration processes all piles.
- Space: `O(1)` — constant auxiliary space.

## 📌 Notes

- Use ceiling division to account for partially consumed piles requiring a full hour.
- Use `high = mid` when the candidate speed is feasible because it might be the minimum answer.
- Use `low = mid + 1` when the candidate speed is insufficient.
- The standard problem guarantees `h >= piles.length`.
