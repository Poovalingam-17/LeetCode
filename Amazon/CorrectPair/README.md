# Count Valid Split Positions in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange)
![Topic](https://img.shields.io/badge/Topic-Hashing-success)
![Status](https://img.shields.io/badge/Status-Solved-brightgreen)

## 📝 Problem Overview

Given a string `s` and an integer `k`, split the string at every possible position into two non-empty parts.

For each split, count the number of **distinct characters that appear in both the left and right substrings**. A split is considered **valid** if this count is **greater than `k`**.

Return the total number of valid split positions.

---

## 🎯 Objective

Determine how many split positions satisfy the condition that the number of common distinct characters between the left and right parts is greater than `k`.

---

## 💡 Approach

A brute-force solution would repeatedly create left and right substrings and compare their distinct characters. However, this approach is inefficient because it recalculates information for every split.

An optimized approach uses **two frequency arrays**:

- One array stores the frequency of characters on the **left** side.
- Another array stores the frequency of characters on the **right** side.

Initially, all characters belong to the right side. As the split moves from left to right:

1. Move the current character from the right frequency array to the left frequency array.
2. Count the number of characters whose frequency is greater than zero in both arrays.
3. If this count is greater than `k`, increment the answer.

This avoids rebuilding substrings and significantly improves performance.

---

## 🔄 Algorithm

1. Store the frequency of every character in the right frequency array.
2. Initialize the left frequency array with all zeros.
3. Traverse the string from left to right.
4. Move the current character from the right side to the left side.
5. Count how many characters are present in both sides.
6. If the count is greater than `k`, increase the answer.
7. Continue until every possible split has been checked.

---

## 📖 Example

### Input

```text
s = "abbcac"
k = 1
```

### Possible Splits

```text
a | bbcac
ab | bcac
abb | cac
abbc | ac
abbca | c
```

### Output

```text
3
```

### Explanation

There are three split positions where the number of common distinct characters is greater than `1`.

---

## ⏱ Complexity Analysis

| Complexity | Value |
|------------|-------|
| **Time Complexity** | **O(26 × N) ≈ O(N)** |
| **Space Complexity** | **O(26) ≈ O(1)** |

### Time Complexity

- The string is traversed once.
- For each split, at most **26 lowercase letters** are checked.

Therefore,

```text
O(26 × N) = O(N)
```

---

### Space Complexity

Two frequency arrays of size **26** are maintained.

```text
Space Complexity = O(26) = O(1)
```

---

## 🧠 Key Concepts

- Frequency Array
- Hashing
- String Processing
- Prefix and Suffix Frequencies
- Character Counting

---

## 📌 Important Observations

- Initially, every character belongs to the right substring.
- Each iteration transfers one character to the left substring.
- A character is considered common only if it exists on both sides.
- Using frequency arrays avoids repeatedly constructing substrings.

---

## 🚀 Optimization

### Brute Force

- Build left and right substrings for every split.
- Store distinct characters using hash sets.
- Compare both sets.

**Time Complexity:** `O(N²)`

---

### Optimized Solution

- Maintain two frequency arrays.
- Update frequencies incrementally while moving the split.
- Count common characters in constant alphabet size.

**Time Complexity:** `O(N)`

---

## 🎓 Learning Outcomes

After solving this problem, you will understand:

- How to optimize string problems using frequency arrays.
- The advantage of maintaining prefix and suffix information.
- How incremental updates eliminate repeated computation.
- When a fixed-size frequency array is preferable to a hash set.

---

## 🔖 Tags

- String
- Hashing
- Frequency Array
- Prefix
- Suffix
- Simulation

---

### ⭐ If you found this explanation helpful, consider giving the repository a **Star**.
