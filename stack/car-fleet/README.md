# Car Fleet

Determine the number of car fleets that will arrive at the target, given each car's starting position and speed.

## 📌 Key Idea

Sort cars by their starting positions in descending order, so the car closest to the target is processed first.

Calculate the time required for each car to reach the target:

`time = (target - position) / speed`

Use a stack to track the arrival times of the fleets.

- If the stack is empty, the current car forms a new fleet.
- If the current car takes longer than the fleet ahead, it cannot catch up before the target and forms a new fleet.
- Otherwise, it catches up with the fleet ahead and becomes part of that fleet.

The number of fleets is the final stack size.

## 📌 Why this approach

Sorting establishes the order in which cars encounter the target.

Processing cars from front to back makes it possible to determine whether each car can catch up with the fleet ahead.

A car that catches up joins that fleet and cannot pass it, so it does not create a new fleet.

## 📌 Pattern

Greedy → Sorting → Fleet Arrival Time Comparison

## 📌 Complexity

- Time: `O(n log n)` — sorting dominates the traversal.
- Space: `O(n)` — the sorted car array and arrival-time stack.

## 📌 Notes

- Use `double` for arrival times to preserve fractional values.
- A car joins the fleet ahead when its arrival time is less than or equal to the fleet's arrival time.
- Only cars with a strictly greater arrival time create new fleets.
