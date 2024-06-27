package org.konstde00.practice;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import one.util.streamex.StreamEx;

import org.konstde00.model.Person;

public class StreamExPractice {

    // ----------- Mapping -----------

    /**
     * Given a map of string keys and integer values, return a map with values incremented by 1.
     * Use `EntryStream.mapValues()`.
     */
    public Map<String, Integer> incrementMapValues(Map<String, Integer> map) {
        return Map.of();
    }

    /**
     * Given a list of persons, return a map of age groups.
     * Group persons by age using `StreamEx.groupingBy()`.
     */
    public Map<Integer, List<Person>> groupByAge(List<Person> people) {
        return Map.of();
    }

    /**
     * Given a list of persons, return a list of their ages.
     * Use `StreamEx.map()`.
     */
    public List<Integer> mapToAges(List<Person> people) {
        return List.of();
    }

    /**
     * Given a list of strings, return a list of their lengths.
     */
    public List<Integer> mapToLengths(List<String> strings) {
        return List.of();
    }

    /**
     * Given a list of integers, return a list of their squares.
     */
    public List<Integer> mapToSquares(List<Integer> numbers) {
        return List.of();
    }

    // ----------- Sorting -----------

    /**
     * Given a list of strings, return a list of strings sorted in reverse order.
     * Use `StreamEx.reverseSorted()`.
     */
    public List<String> sortInReverseOrder(List<String> strings) {
        return List.of();
    }

    /**
     * Given a list of persons, return a list of persons sorted by age in ascending order.
     * Use `StreamEx.sortedBy()`.
     */
    public List<Person> sortByAge(List<Person> people) {
        return List.of();
    }

    /**
     * Given a list of integers, return a list of integers sorted by absolute value.
     * Use `StreamEx.sortedByInt()`.
     */
    public List<Integer> sortByAbsoluteValue(List<Integer> numbers) {
        return List.of();
    }

    /**
     * Given a list of strings, return a list of strings sorted by their lengths.
     */
    public List<String> sortByLength(List<String> strings) {
        return List.of();
    }

    // ----------- Reduction -----------

    /**
     * Given a list of integers, return the sum of all integers.
     * Use `StreamEx.reduce()`.
     */
    public int sumOfIntegers(List<Integer> numbers) {
        return 0;
    }

    /**
     * Given a list of integers, return a cumulative sum list.
     * Use `StreamEx.prefix()`.
     */
    public List<Integer> cumulativeSum(List<Integer> numbers) {
        return List.of();
    }

    /**
     * Given a list of strings, return a map of character counts.
     * Use `StreamEx.split()` and `StreamEx.groupingBy()`.
     */
    public Map<Character, Long> charCount(String input) {
        return Map.of();
    }

    /**
     * Given a list of integers, return the maximum value.
     * Use `StreamEx.max()`.
     */
    public Optional<Integer> findMaxValue(List<Integer> numbers) {
        return Optional.empty();
    }

    /**
     * Given a list of strings, return a single string which is the concatenation of all strings.
     * Use `StreamEx.joining()`.
     */
    public String concatenateStrings(List<String> strings) {
        return "";
    }

    // ----------- Transformation -----------

    /**
     * Given a list of persons, return a set of unique names.
     * Use `StreamEx.map()` and `StreamEx.toSet()`.
     */
    public Set<String> uniqueNames(List<Person> people) {
        return Set.of();
    }

    // ----------- EntryStream operations -----------

    /**
     * Given a map of integers to strings, return a map where the keys and values are swapped.
     * Use `EntryStream.invert()`.
     */
    public Map<String, Integer> invertMap(Map<Integer, String> map) {
        return Map.of();
    }

    /**
     * Given a map of strings to integers, return a list of keys.
     * Use `EntryStream.keys()`.
     */
    public List<String> extractKeys(Map<String, Integer> map) {
        return List.of();
    }

    /**
     * Given a map of strings to integers, return a list of values.
     * Use `EntryStream.values()`.
     */
    public List<Integer> extractValues(Map<String, Integer> map) {
        return List.of();
    }

    /**
     * Given a map of strings to integers, return a list of strings where each string is in the format "key=value".
     * Use `EntryStream.join()`.
     */
    public List<String> convertEntriesToString(Map<String, Integer> map) {
        return List.of();
    }

    // ----------- Flat-mapping -----------

    /**
     * Given a list of integers, return a list of strings where each integer is duplicated as a string.
     * Use `IntStreamEx.flatMapToObj()`.
     */
    public List<String> flatMapToString(List<Integer> numbers) {
        return List.of();
    }

    /**
     * Given a list of integers and an array of strings, return a list of entries representing the cross product.
     * Use `StreamEx.cross()`.
     */
    public List<Map.Entry<Integer, String>> crossProduct(List<Integer> numbers, String[] strings) {
        return List.of();
    }

    /**
     * Given a list of lists of integers, return a flattened list of integers.
     * Use `StreamEx.flatMap()`.
     */
    public List<Integer> flattenListOfLists(List<List<Integer>> listOfLists) {
        return List.of();
    }

    /**
     * Given a map of integers to lists of strings, return a list of entries where each entry contains an integer key and a string value.
     * Use `EntryStream.flatMapKeyValue()`.
     */
    public List<Map.Entry<Integer, String>> flatMapKeyValue(Map<Integer, List<String>> map) {
        return List.of();
    }
}
