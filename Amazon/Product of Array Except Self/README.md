# 238. Product of Array Except Self

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange)
![Topic](https://img.shields.io/badge/Topic-Prefix%20%26%20Suffix-success)
![Status](https://img.shields.io/badge/Status-Solved-brightgreen)

---

## 📝 Problem Overview

Given an integer array `nums`, return an array `answer` such that:

- `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.
- The solution **must not use the division operator**.
- The algorithm should run in **O(n)** time.

---

## 🎯 Objective

Compute the product of all elements except the current element for every index while maintaining linear time complexity and constant extra space (excluding the output array).

---

## 💡 Approach

The solution uses the **Prefix Product** and **Suffix Product** technique.

Instead of computing the product for every index separately, we split the calculation into two parts:

- **Prefix Product** → Product of all elements to the left of the current index.
- **Suffix Product** → Product of all elements to the right of the current index.

### Step 1

Traverse the array from left to right and store the product of all previous elements.

### Step 2

Traverse the array from right to left while maintaining a running suffix product.

Multiply the stored prefix product with the current suffix product to obtain the final answer.

This eliminates the need for an additional suffix array and achieves constant extra space.

---

## 🔄 Algorithm

1. Create an output array.
2. Initialize the first element of the output array as `1`.
3. Traverse from left to right and store prefix products.
4. Initialize a variable `right = 1`.
5. Traverse from right to left.
6. Multiply the current output value with `right`.
7. Update `right` by multiplying it with the current array element.
8. Return the output array.

---

## 🌳 Visualization

### Input

```text
nums = [1, 2, 3, 4]
```

### Prefix Products

```text
Index :   0   1   2   3

Nums  :   1   2   3   4

Prefix:   1   1   2   6
```

### Right Traversal

```text
Initially

right = 1

res = [1,1,2,6]

--------------------------------

i = 3

res[3] = 6 × 1 = 6

right = 1 × 4 = 4

--------------------------------

i = 2

res[2] = 2 × 4 = 8

right = 4 × 3 = 12

--------------------------------

i = 1

res[1] = 1 × 12 = 12

right = 12 × 2 = 24

--------------------------------

i = 0

res[0] = 1 × 24 = 24

right = 24 × 1 = 24
```

Final Result

```text
[24,12,8,6]
```

---

## 📖 Example

### Input

```text
nums = [1,2,3,4]
```

### Output

```text
[24,12,8,6]
```

### Explanation

| Index | Product Except Self |
|------:|---------------------|
| 0 | 2 × 3 × 4 = 24 |
| 1 | 1 × 3 × 4 = 12 |
| 2 | 1 × 2 × 4 = 8 |
| 3 | 1 × 2 × 3 = 6 |

---

## ⏱ Complexity Analysis

| Complexity | Value |
|------------|-------|
| **Time Complexity** | **O(N)** |
| **Space Complexity** | **O(1)** *(excluding the output array)* |

### Time Complexity

- One traversal to compute prefix products.
- One traversal to compute suffix products.

Therefore,

```text
O(N)
```

---

### Space Complexity

The algorithm only uses:

- One output array (not counted as extra space)
- One variable to maintain the suffix product.

Hence,

```text
O(1)
```

---

## 🧠 Key Concepts

- Prefix Product
- Suffix Product
- Array Traversal
- Constant Space Optimization
- Dynamic Product Computation

---

## 📌 Important Observations

- Division is **not allowed**.
- Prefix products are stored directly in the output array.
- A separate suffix array is unnecessary.
- The running suffix product is maintained using a single variable.
- Every index is processed exactly twice.

---

## 🚀 Optimization

### Brute Force

For every index:

- Traverse the entire array.
- Multiply every element except the current one.

**Time Complexity:** `O(N²)`

---

### Better Approach

- Build separate prefix and suffix arrays.
- Multiply corresponding values.

**Time Complexity:** `O(N)`

**Space Complexity:** `O(N)`

---

### Optimal Approach (Current Solution)

- Store prefix products in the output array.
- Maintain only one suffix product variable.

**Time Complexity:** `O(N)`

**Space Complexity:** `O(1)`

---

## 🎓 Learning Outcomes

After solving this problem, you will understand:

- How prefix and suffix computations optimize array problems.
- How to eliminate unnecessary auxiliary arrays.
- How to solve product-related problems without using division.
- How to achieve constant extra space while maintaining linear time.

---

## 🔖 Tags

- Array
- Prefix Sum
- Prefix Product
- Suffix Product
- Dynamic Programming Pattern
- Space Optimization

---

### ⭐ If you found this explanation helpful, consider giving the repository a **Star**.
