# StreamEx Practice Tasks

## Mapping

### Task 1

Given a map of string keys and integer values, return a map with values incremented by 1. Use `EntryStream.mapValues()`.

### Task 2

Given a list of persons, return a map of age groups. Group persons by age using `StreamEx.groupingBy()`.

### Task 3

Given a list of persons, return a list of their ages. Use `StreamEx.map()`.

### Task 4

Given a list of strings, return a list of their lengths.

### Task 5

Given a list of integers, return a list of their squares.

## Sorting

### Task 6

Given a list of strings, return a list of strings sorted in reverse order. Use `StreamEx.reverseSorted()`.

### Task 7

Given a list of persons, return a list of persons sorted by age in ascending order. Use `StreamEx.sortedBy()`.

### Task 8

Given a list of integers, return a list of integers sorted by absolute value. Use `StreamEx.sortedByInt()`.

### Task 9

Given a list of strings, return a list of strings sorted by their lengths.

## Reduction

### Task 10

Given a list of integers, return the sum of all integers. Use `StreamEx.reduce()`.

### Task 11

Given a list of integers, return a cumulative sum list. Use `StreamEx.prefix()`.

### Task 12

Given a list of strings, return a map of character counts. Use `StreamEx.split()` and `StreamEx.groupingBy()`.

### Task 13

Given a list of integers, return the maximum value. Use `StreamEx.max()`.

### Task 14

Given a list of strings, return a single string which is the concatenation of all strings. Use `StreamEx.joining()`.

## Transformation

### Task 15

Given a list of persons, return a set of unique names. Use `StreamEx.map()` and `StreamEx.toSet()`.

## EntryStream Operations

### Task 16

Given a map of integers to strings, return a map where the keys and values are swapped. Use `EntryStream.invert()`.

### Task 17

Given a map of strings to integers, return a list of keys. Use `EntryStream.keys()`.

### Task 18

Given a map of strings to integers, return a list of values. Use `EntryStream.values()`.

### Task 19

Given a map of strings to integers, return a list of strings where each string is in the format "key=value". Use `EntryStream.join()`.

## Flat-Mapping

### Task 20

Given a list of integers, return a list of strings where each integer is duplicated as a string. Use `IntStreamEx.flatMapToObj()`.

### Task 21

Given a list of integers and an array of strings, return a list of entries representing the cross product. Use `StreamEx.cross()`.

### Task 22

Given a list of lists of integers, return a flattened list of integers. Use `StreamEx.flatMap()`.

### Task 23

Given a map of integers to lists of strings, return a list of entries where each entry contains an integer key and a string value. Use `EntryStream.flatMapKeyValue()`.
