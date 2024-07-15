package org.konstde00.practice;

import java.util.*;
import java.util.stream.Collectors;

import one.util.streamex.EntryStream;
import one.util.streamex.IntStreamEx;
import one.util.streamex.StreamEx;

import org.konstde00.model.Person;

public class StreamExPractice {

    // ----------- Mapping -----------

    /**
     * Given a map of string keys and integer values, return a map with values incremented by 1.
     * Use `EntryStream.mapValues()`.
     */
    public Map<String, Integer> incrementMapValues(Map<String, Integer> map) {

        return EntryStream.of(map)
                .mapValues(v -> v += 1)
                .toMap();
    }

    /**
     * Given a list of persons, return a map of age groups.
     * Group persons by age using `StreamEx.groupingBy()`.
     */
    public Map<Integer, List<Person>> groupByAge(List<Person> people) {

        return StreamEx.of(people)
                .groupingBy(Person::getAge);
    }

    /**
     * Given a list of persons, return a list of their ages.
     * Use `StreamEx.map()`.
     */
    public List<Integer> mapToAges(List<Person> people) {

        return StreamEx.of(people)
                .map(Person::getAge)
                .toList();
    }

    /**
     * Given a list of strings, return a list of their lengths.
     */
    public List<Integer> mapToLengths(List<String> strings) {

        return StreamEx.of(strings)
                .map(String::length)
                .toList();
    }

    /**
     * Given a list of integers, return a list of their squares.
     */
    public List<Integer> mapToSquares(List<Integer> numbers) {

        return StreamEx.of(numbers)
                .map(x -> (int) Math.pow(x, 2))
                .toList();
    }

    // ----------- Sorting -----------

    /**
     * Given a list of strings, return a list of strings sorted in reverse order.
     * Use `StreamEx.reverseSorted()`.
     */
    public List<String> sortInReverseOrder(List<String> strings) {

        return StreamEx.of(strings)
                .reverseSorted()
                .toList();
    }

    /**
     * Given a list of persons, return a list of persons sorted by age in ascending order.
     * Use `StreamEx.sortedBy()`.
     */
    public List<Person> sortByAge(List<Person> people) {

        return StreamEx.of(people)
                .sortedBy(Person::getAge)
                .toList();
    }

    /**
     * Given a list of integers, return a list of integers sorted by absolute value.
     * Use `StreamEx.sortedByInt()`.
     */
    public List<Integer> sortByAbsoluteValue(List<Integer> numbers) {

        return StreamEx.of(numbers)
                .sortedByInt(Math::abs)
                .toList();
    }

    /**
     * Given a list of strings, return a list of strings sorted by their lengths.
     */
    public List<String> sortByLength(List<String> strings) {

        return StreamEx.of(strings)
                .sortedByInt(String::length)
                .toList();
    }

    // ----------- Reduction -----------

    /**
     * Given a list of integers, return the sum of all integers.
     * Use `StreamEx.reduce()`.
     */
    public int sumOfIntegers(List<Integer> numbers) {

        return StreamEx.of(numbers)
                .reduce(Integer::sum)
                .orElse(0);
    }

    /**
     * Given a list of integers, return a cumulative sum list.
     * Use `StreamEx.prefix()`.
     */
    public List<Integer> cumulativeSum(List<Integer> numbers) {

        return StreamEx.of(numbers)
                .prefix(Integer::sum)
                .toList();
    }

    /**
     * Given a list of strings, return a map of character counts.
     * Use `StreamEx.split()` and `StreamEx.groupingBy()`.
     */
    public Map<Character, Long> charCount(String input) {

        return StreamEx
                .split(input, "")
                .map(s -> s.charAt(0))
                .groupingBy(c -> c, Collectors.counting());
    }

    /**
     * Given a list of integers, return the maximum value.
     * Use `StreamEx.max()`.
     */
    public Optional<Integer> findMaxValue(List<Integer> numbers) {

        return StreamEx.of(numbers)
                .max(Comparator.naturalOrder());
    }

    /**
     * Given a list of strings, return a single string which is the concatenation of all strings.
     * Use `StreamEx.joining()`.
     */
    public String concatenateStrings(List<String> strings) {

        return StreamEx.of(strings)
                .joining();
    }

    // ----------- Transformation -----------

    /**
     * Given a list of persons, return a set of unique names.
     * Use `StreamEx.map()` and `StreamEx.toSet()`.
     */
    public Set<String> uniqueNames(List<Person> people) {

        return StreamEx.of(people)
                .map(Person::getName)
                .toSet();
    }

    // ----------- EntryStream operations -----------

    /**
     * Given a map of integers to strings, return a map where the keys and values are swapped.
     * Use `EntryStream.invert()`.
     */
    public Map<String, Integer> invertMap(Map<Integer, String> map) {

        return EntryStream.of(map)
                .invert()
                .toMap();
    }

    /**
     * Given a map of strings to integers, return a list of keys.
     * Use `EntryStream.keys()`.
     */
    public List<String> extractKeys(Map<String, Integer> map) {

        return EntryStream.of(map)
                .keys()
                .toList();
    }

    /**
     * Given a map of strings to integers, return a list of values.
     * Use `EntryStream.values()`.
     */
    public List<Integer> extractValues(Map<String, Integer> map) {

        return EntryStream.of(map)
                .values()
                .toList();
    }

    /**
     * Given a map of strings to integers, return a list of strings where each string is in the format "key=value".
     * Use `EntryStream.join()`.
     */
    public List<String> convertEntriesToString(Map<String, Integer> map) {

        return EntryStream.of(map)
                .join("=")
                .toList();
    }

    // ----------- Flat-mapping -----------

    /**
     * Given a list of integers, return a list of strings where each integer is duplicated as a string.
     * Use `IntStreamEx.flatMapToObj()`.
     */
    public List<String> flatMapToString(List<Integer> numbers) {

        return IntStreamEx.of(numbers)
                .mapToObj(String::valueOf)
                .toList();
    }

    /**
     * Given a list of integers and an array of strings, return a list of entries representing the cross product.
     * Use `StreamEx.cross()`.
     */
    public List<Map.Entry<Integer, String>> crossProduct(List<Integer> numbers, String[] strings) {

        return StreamEx.of(numbers)
                .cross(strings)
                .toList();
    }

    /**
     * Given a list of lists of integers, return a flattened list of integers.
     * Use `StreamEx.flatMap()`.
     */
    public List<Integer> flattenListOfLists(List<List<Integer>> listOfLists) {

        return StreamEx.of(listOfLists)
                .flatMap(List::stream)
                .toList();
    }

    /**
     * Given a map of integers to lists of strings, return a list of entries where each entry contains an integer key and a string value.
     * Use `EntryStream.flatMapKeyValue()`.
     */
    public List<Map.Entry<Integer, String>> flatMapKeyValue(Map<Integer, List<String>> map) {

        return EntryStream.of(map)
                .flatMapKeyValue((key, values) ->
                        StreamEx.of(values)
                                .map(value -> Map.entry(key, value)))
                .toList();
    }
}
