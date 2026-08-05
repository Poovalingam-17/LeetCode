# Maximum Frequency Difference in Any Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange)
![Topic](https://img.shields.io/badge/Topic-Hashing-success)
![Status](https://img.shields.io/badge/Status-Solved-brightgreen)

---

## 📝 Problem Overview

Given an integer array, consider every possible contiguous subarray.

For each subarray:

- Count the frequency of every distinct element.
- Determine the **maximum** and **minimum** frequencies among the distinct elements.
- Compute the frequency difference:

```text
Maximum Frequency − Minimum Frequency
```

Return the **largest frequency difference** among all possible subarrays.

---

## 🎯 Objective

Find the maximum possible difference between the highest and lowest occurring element frequencies in any contiguous subarray.

---

## 💡 Approach

The solution examines every possible subarray using two nested loops.

For each starting index:

1. Extend the subarray one element at a time.
2. Maintain the frequency of each element using a hash map.
3. After adding a new element, determine:
   - Maximum frequency
   - Minimum frequency
4. Compute the difference between them.
5. Update the overall maximum difference.

Since frequencies are updated incrementally, rebuilding the frequency map for every subarray is avoided.

---

## 🔄 Algorithm

1. Initialize the answer as `0`.
2. Iterate through every possible starting index.
3. Create an empty frequency map.
4. Expand the ending index from the current start.
5. Update the frequency of the newly included element.
6. Traverse the frequency map to find:
   - Maximum frequency
   - Minimum frequency
7. Compute the difference.
8. Update the maximum answer.
9. Continue until every subarray has been processed.

---

## 🌳 Example

### Input

```text
arr = [3, 4, 1, 3, 2]
```

### Some Subarrays

| Subarray | Frequencies | Difference |
|----------|-------------|-----------:|
| [3] | {3:1} | 0 |
| [3,4] | {3:1,4:1} | 0 |
| [3,4,1] | {3:1,4:1,1:1} | 0 |
| [3,4,1,3] | {3:2,4:1,1:1} | 1 |
| [3,4,1,3,2] | {3:2,4:1,1:1,2:1} | 1 |

### Output

```text
1
```

---

## 📊 Complexity Analysis

| Complexity | Value |
|------------|-------|
| **Time Complexity** | **O(N² × D)** |
| **Space Complexity** | **O(D)** |

Where:

- **N** = Size of the array
- **D** = Number of distinct elements in the current subarray

### Time Complexity

- Two nested loops generate all possible subarrays.
- For every subarray, the frequency map is scanned to determine the maximum and minimum frequencies.

Therefore,

```text
O(N² × D)
```

In the worst case, where every element is distinct:

```text
O(N³)
```

---

### Space Complexity

The hash map stores frequencies of distinct elements present in the current subarray.

```text
Space Complexity = O(D)
```

Worst case:

```text
O(N)
```

---

## 🧠 Key Concepts

- HashMap
- Frequency Counting
- Nested Loops
- Array Traversal
- Brute Force
- Subarrays

---

## 📌 Important Observations

- Every subarray is considered exactly once.
- The frequency map grows as the subarray expands.
- Only distinct elements are stored in the hash map.
- The answer is updated whenever a larger frequency difference is found.
- Single-element subarrays always contribute a difference of `0`.

---

## 🚀 Optimization

### Brute Force

- Generate every subarray.
- Recalculate frequencies from scratch.

**Time Complexity:** `O(N³)`

---

### Improved Approach (Current Solution)

- Expand one subarray at a time.
- Update frequencies incrementally using a hash map.
- Scan only the frequency values for each extension.

**Time Complexity:** `O(N² × D)`

---

## 🎓 Learning Outcomes

After solving this problem, you will understand:

- How to process all subarrays efficiently.
- How to maintain frequencies dynamically using a hash map.
- The importance of incremental updates instead of recomputing frequencies.
- How nested loops and hashing work together for subarray-based problems.

---

## 🔖 Tags

- Array
- HashMap
- Frequency Counting
- Simulation
- Brute Force
- Subarray

---

### ⭐ If you found this explanation helpful, consider giving the repository a **Star**.
