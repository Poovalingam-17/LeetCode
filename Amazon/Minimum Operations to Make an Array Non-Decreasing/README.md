# Minimum Operations to Make an Array Non-Decreasing

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange)
![Topic](https://img.shields.io/badge/Topic-Greedy-success)
![Status](https://img.shields.io/badge/Status-Solved-brightgreen)

---

## 📝 Problem Overview

Given an integer array, you may perform the following operation any number of times:

- Choose an element and **increase it by 3**.

Determine the **minimum number of operations** required to make the array **non-decreasing**, where every element satisfies:

```text
arr[i] ≤ arr[i + 1]
```

If the array is already non-decreasing, no operations are required.

---

## 🎯 Objective

Find the minimum number of increments (each increment adds **3**) needed so that every element is greater than or equal to its previous element.

---

## 💡 Approach

This problem can be solved using a **Greedy** strategy.

Traverse the array from left to right.

For each adjacent pair:

- If the current element is less than the previous element, repeatedly increase the current element by `3`.
- Continue until it becomes greater than or equal to the previous element.
- Count every increment performed.

Since each element only depends on the previous adjusted element, fixing the array from left to right guarantees the minimum number of operations.

---

## 🔄 Algorithm

1. Initialize the operation count as `0`.
2. Traverse the array from left to right.
3. Compare the current element with the previous element.
4. If the current element is smaller:
   - Increase it by `3`.
   - Increment the operation count.
   - Repeat until the condition is satisfied.
5. Continue for the remaining elements.
6. Return the total number of operations.

---

## 📖 Example

### Input

```text
arr = [3, 4, 1, 6, 2]
```

### Process

```text
Initial

[3, 4, 1, 6, 2]

-------------------------

Index 2

1 < 4

1 → 4

Operations = 1

Array

[3, 4, 4, 6, 2]

-------------------------

Index 4

2 < 6

2 → 5

Operations = 2

5 < 6

5 → 8

Operations = 3

Final Array

[3, 4, 4, 6, 8]
```

### Output

```text
3
```

---

## 📊 Complexity Analysis

| Complexity | Value |
|------------|-------|
| **Time Complexity** | **O(N + K)** |
| **Space Complexity** | **O(1)** |

Where:

- **N** = Number of elements
- **K** = Total number of increment operations performed

### Time Complexity

- The array is traversed once.
- Additional iterations occur only when increments are required.

Overall,

```text
O(N + K)
```

---

### Space Complexity

Only a few variables are used.

```text
O(1)
```

---

## 🧠 Key Concepts

- Greedy Algorithm
- Array Traversal
- Simulation
- Increment Operations
- In-Place Modification

---

## 📌 Important Observations

- Each element is adjusted only when necessary.
- Once an element becomes valid, it never needs to be modified again.
- The algorithm processes the array from left to right.
- The array is modified in place.
- The greedy choice guarantees the minimum number of operations.

---

## 🚀 Optimization

### Brute Force

- Try different increment combinations.
- Check whether the array becomes sorted.

**Time Complexity:** Exponential

---

### Greedy Approach (Current Solution)

- Process elements sequentially.
- Increase only when required.
- Stop immediately after satisfying the condition.

**Time Complexity:** `O(N + K)`

**Space Complexity:** `O(1)`

---

## 🎓 Learning Outcomes

After solving this problem, you will understand:

- How greedy algorithms minimize operations.
- How simulation can efficiently solve array transformation problems.
- Why processing elements from left to right ensures correctness.
- How in-place modifications reduce memory usage.

---

## 🔖 Tags

- Array
- Greedy
- Simulation
- In-Place Algorithm
- Iteration

---

### ⭐ If you found this explanation helpful, consider giving the repository a **Star**.
