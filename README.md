# java-unit5-bp9
<h2><strong>Project Part 1: Runtime</strong></h2>

<strong>Goal</strong>
Students will be able to come up with solutions to given coding problems, analyze their runtime, and improve their solutions in terms of space and time efficiency.

<h3><strong>Concepts</strong></h3>

 - runtime
 - memory

<h3><strong>Setup</strong></h3>

For this exercise, set a timer for 30 minutes. Read the problem below, and then try to code a solution within the time frame in a file called MissingNumber.java. It’s okay if you don’t get through all the parts, complete as much as you can while still being thorough and thoughtful.

<h3><strong>The Problem </strong></h3>

Imagine a list of numbers from 1 to max_num, inclusive - except that one of these numbers will be missing from the list.

 - Write a function that takes this list of numbers, as well as the max_num, and it should return the missing number.

 - For example, given a list of numbers, in random order, of 1…10, 8 was removed. If this list and the maxNum of 10 was passed into the function, it would return 8: missingNumber({2, 1, 4, 3, 6, 5, 7, 10, 9}, 10) ⇒ 8

 - If there is no missing number, the function should return 0.

<h3><strong>Steps</strong></h3>
<strong>1. Reduce Runtime</strong>

 - Initially, focus on reducing runtime—this should be solvable in O(n) time. You can create an additional data structure using a Java library if necessary.

 - Write a version that uses a straightforward solution and runs in O(n) time.

<strong>2. Reduce Memory</strong>

 - Now, think about reducing memory use—did your first solution require you to create a new object? Can you think of a different way to think about the problem that doesn’t use additional memory, even if it takes more time?

 - There’s a way you could solve this in O(n log n) time that doesn’t require creating another large data structure (technically, while being O(n log n) in runtime, it is O(1) in “runspace”—it uses the same amount of memory no matter how big n is).

<strong>3. Going Further…</strong>
There’s a solution that has O(n) runtime and O(1) runspace, but it requires a bit of creative thinking about the problem from a math perspective. See if you can find it.

<strong>4. Solution and Reflection</strong>
