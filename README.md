# Unexpected Element Removal in Kotlin's `removeIf`

This repository demonstrates a subtle bug in Kotlin's `removeIf` function where elements are unexpectedly removed even when the predicate should always evaluate to false.  This is likely due to unintended side effects within the predicate itself.

The `bug.kt` file contains the code exhibiting the problem. The `bugSolution.kt` file offers a corrected implementation.

## Issue
The issue arises when the predicate within `removeIf` modifies the collection being iterated, leading to unexpected behavior and incorrect results.

## Solution
The solution involves ensuring the predicate doesn't modify the collection, either by creating a copy or avoiding any changes within the predicate itself.