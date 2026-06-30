# Perfect Number Finder

A simple Java console program that finds and lists all **perfect numbers** below a user-given limit (N).

A perfect number is a positive integer that is equal to the sum of its proper divisors (all divisors excluding itself). For example, **6** is perfect because `1 + 2 + 3 = 6`, and **28** is perfect because `1 + 2 + 4 + 7 + 14 = 28`.

This project was built as part of an Object-Oriented Programming (OOP) lab assignment, focused on practicing class design, method decomposition, and basic algorithmic problem solving in Java.

## Features

- Checks whether any given integer is a perfect number
- Scans a range from 1 up to a user-defined maximum (N)
- Displays results in a clean, formatted table
- Separates business logic (`PerfectNumber`) from the program entry point (`TestPerfect`)

## Project Structure

```
perfect-number-finder/
├── src/
│   ├── PerfectNumber.java   # Business logic: checks if a number is perfect
│   └── TestPerfect.java     # Entry point: handles input/output
└── README.md
```

## How It Works

1. `TestPerfect` prompts the user for a maximum value `N`.
2. It loops through every integer from `1` to `N - 1`, using `PerfectNumber.isPerfect(int)` to test each one.
3. `isPerfect(int n)` sums up all divisors of `n` (using the helper method `isMultipleOf(int, int)`) and checks if that sum equals `n`.
4. All perfect numbers found are stored and printed in a table, along with a total count.

## Algorithm (Pseudocode)

```
isPerfect(n):
    if n <= 1:
        return false
    sum = 0
    for i = 1 to n - 1:
        if isMultipleOf(n, i):
            sum = sum + i
    return sum == n

isMultipleOf(num, base):
    return (num % base == 0)
```

## How to Run

### Requirements
- Java JDK 8 or higher

### Compile and run from the command line

```bash
cd src
javac *.java
java TestPerfect
```

### Example

```
==========================================
        LAB 1 - PERFECT NUMBERS FINDER   
==========================================
Enter the maximum value to check: 30

Perfect numbers found below 30:
------------------------------------------
Index      | Value     
------------------------------------------
1          | 6         
2          | 28        
------------------------------------------
Total perfect numbers found: 2
```

## Author

Nasim Bidel
