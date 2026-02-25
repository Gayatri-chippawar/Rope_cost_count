# 🧵 Minimum Cost to Connect Ropes (Using Priority Queue)
## 📌 Problem Statement

Given N ropes of different lengths, the task is to connect these ropes into one single rope with minimum total cost.

The cost to connect two ropes is equal to the sum of their lengths.

After connecting two ropes, the new rope length becomes their sum.

Continue until only one rope remains.

## 💡 Approach Used

This problem is solved using a Min-Heap (Priority Queue).

Why Priority Queue?

To minimize cost:

Always connect the two smallest ropes first

This ensures minimal incremental cost at every step

This is a classic Greedy Algorithm

Java’s PriorityQueue works as a Min-Heap by default.

## 🔍 Step-by-Step Execution

Input:

[4, 3, 2, 6]
Step 1:

Connect 2 + 3 = 5
Cost = 5
Heap → [4, 5, 6]

Step 2:

Connect 4 + 5 = 9
Cost = 5 + 9 = 14
Heap → [6, 9]

Step 3:

Connect 6 + 9 = 15
Cost = 14 + 15 = 29

✅ Final Minimum Cost = 29

## ⏱️ Time Complexity

Insertion into heap → O(n log n)

Each poll/add → O(log n)

Total → O(n log n)

## 📦 Space Complexity

Priority Queue stores all ropes → O(n)

## 🧠 Key Concepts

Greedy Strategy

Min Heap

Priority Queue

Optimal Merge Pattern

Similar to Huffman Coding Concept

## 🎯 Learning Outcome

Understanding how greedy works with heaps

Using Java PriorityQueue

Writing optimal solutions for merge-type problems
