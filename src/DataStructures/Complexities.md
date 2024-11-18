# Big O Notation

Big O Notation describes the performance or complexity of an algorithm, focusing on how its runtime or space requirements grow as the input size increases.

---

## Common Big O Notations

### **O(1) - Constant Time**
The algorithm's runtime does not change regardless of the input size.

---

### **O(log n) - Logarithmic Time**
The runtime grows logarithmically as the input size increases. Often involves dividing the input in each step, like binary search.

---

### **O(n) - Linear Time**
The runtime grows proportionally with the input size.

---

### **O(n log n) - Log-Linear Time**
The runtime grows linearly with the input size but involves a logarithmic factor. Common in efficient sorting algorithms like merge sort.

---

### **O(n²) - Quadratic Time**
The runtime grows proportionally to the square of the input size. Often caused by nested loops.

---

### **O(2ⁿ) - Exponential Time**
The runtime doubles with each additional input size. Extremely inefficient for large inputs.

---

### **O(n!) - Factorial Time**
The runtime grows factorially with the input size. Usually associated with algorithms that compute all permutations or combinations of a dataset.

---

## Big O Growth Rates Summary

| Big O Notation | Name               | Growth Rate Efficiency |
|----------------|--------------------|-------------------------|
| O(1)           | Constant Time      | Best                   |
| O(log n)       | Logarithmic Time   | Excellent              |
| O(n)           | Linear Time        | Good                   |
| O(n log n)     | Log-Linear Time    | Moderate               |
| O(n²)          | Quadratic Time     | Poor                   |
| O(2ⁿ)          | Exponential Time   | Very Poor              |
| O(n!)          | Factorial Time     | Extremely Poor         |

---

## Key Notes
- Big O represents the **upper bound** or worst-case scenario of an algorithm’s complexity.
- Lower complexity = better performance for large inputs.
- Aim for efficient algorithms (e.g., O(log n), O(n)) when possible.  
