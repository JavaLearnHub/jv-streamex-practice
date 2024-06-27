package org.konstde00.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.konstde00.model.Person;

class StreamExPracticeTest {

    private final StreamExPractice practice = new StreamExPractice();

    // ----------- Mapping -----------

    @Test
    void testIncrementMapValues() {
        Map<String, Integer> input = Map.of("a", 1, "b", 2, "c", 3);
        Map<String, Integer> expected = Map.of("a", 2, "b", 3, "c", 4);
        assertEquals(expected, practice.incrementMapValues(input));
    }

    @Test
    void testGroupByAge() {
        List<Person> people = List.of(new Person("John", 25), new Person("Jane", 30), new Person("John", 25));
        Map<Integer, List<Person>> expected = Map.of(
                25, List.of(new Person("John", 25), new Person("John", 25)),
                30, List.of(new Person("Jane", 30))
        );
        assertEquals(expected, practice.groupByAge(people));
    }

    @Test
    void testMapToAges() {
        List<Person> people = List.of(new Person("John", 25), new Person("Jane", 30));
        List<Integer> expected = List.of(25, 30);
        assertEquals(expected, practice.mapToAges(people));
    }

    @Test
    void testMapToLengths() {
        List<String> strings = List.of("apple", "banana", "cherry");
        List<Integer> expected = List.of(5, 6, 6);
        assertEquals(expected, practice.mapToLengths(strings));
    }

    @Test
    void testMapToSquares() {
        List<Integer> numbers = List.of(1, 2, 3);
        List<Integer> expected = List.of(1, 4, 9);
        assertEquals(expected, practice.mapToSquares(numbers));
    }

    // ----------- Sorting -----------

    @Test
    void testSortInReverseOrder() {
        List<String> strings = List.of("apple", "banana", "cherry");
        List<String> expected = List.of("cherry", "banana", "apple");
        assertEquals(expected, practice.sortInReverseOrder(strings));
    }

    @Test
    void testSortByAge() {
        List<Person> people = List.of(new Person("John", 30), new Person("Jane", 25));
        List<Person> expected = List.of(new Person("Jane", 25), new Person("John", 30));
        assertEquals(expected, practice.sortByAge(people));
    }

    @Test
    void testSortByAbsoluteValue() {
        List<Integer> numbers = List.of(-3, 1, -2);
        List<Integer> expected = List.of(1, -2, -3);
        assertEquals(expected, practice.sortByAbsoluteValue(numbers));
    }

    @Test
    void testSortByLength() {
        List<String> strings = List.of("apple", "banana", "cherry");
        List<String> expected = List.of("apple", "banana", "cherry");
        assertEquals(expected, practice.sortByLength(strings));
    }

    // ----------- Reduction -----------

    @Test
    void testSumOfIntegers() {
        List<Integer> numbers = List.of(1, 2, 3);
        int expected = 6;
        assertEquals(expected, practice.sumOfIntegers(numbers));
    }

    @Test
    void testCumulativeSum() {
        List<Integer> numbers = List.of(1, 2, 3);
        List<Integer> expected = List.of(1, 3, 6);
        assertEquals(expected, practice.cumulativeSum(numbers));
    }

    @Test
    void testCharCount() {
        String input = "apple";
        Map<Character, Long> expected = Map.of('a', 1L, 'p', 2L, 'l', 1L, 'e', 1L);
        assertEquals(expected, practice.charCount(input));
    }

    @Test
    void testFindMaxValue() {
        List<Integer> numbers = List.of(1, 2, 3);
        Optional<Integer> expected = Optional.of(3);
        assertEquals(expected, practice.findMaxValue(numbers));
    }

    @Test
    void testConcatenateStrings() {
        List<String> strings = List.of("apple", "banana", "cherry");
        String expected = "applebananacherry";
        assertEquals(expected, practice.concatenateStrings(strings));
    }

    // ----------- Transformation -----------

    @Test
    void testUniqueNames() {
        List<Person> people = List.of(new Person("John", 25), new Person("Jane", 30), new Person("John", 25));
        Set<String> expected = Set.of("John", "Jane");
        assertEquals(expected, practice.uniqueNames(people));
    }

    // ----------- EntryStream operations -----------

    @Test
    void testInvertMap() {
        Map<Integer, String> input = Map.of(1, "a", 2, "b", 3, "c");
        Map<String, Integer> expected = Map.of("a", 1, "b", 2, "c", 3);
        assertEquals(expected, practice.invertMap(input));
    }

    @Test
    void testExtractKeys() {
        Map<String, Integer> input = Map.of("a", 1, "b", 2, "c", 3);
        List<String> expected = List.of("a", "b", "c");
        Matchers.containsInAnyOrder(expected, practice.extractKeys(input));
    }

    @Test
    void testExtractValues() {
        Map<String, Integer> input = Map.of("a", 1, "b", 2, "c", 3);
        List<Integer> expected = List.of(1, 2, 3);
        Matchers.containsInAnyOrder(expected, practice.extractValues(input));
    }

    @Test
    void testConvertEntriesToString() {
        Map<String, Integer> input = Map.of("a", 1, "b", 2, "c", 3);
        List<String> expected = List.of("a=1", "b=2", "c=3");
        Matchers.containsInAnyOrder(expected, practice.convertEntriesToString(input));
    }

    // ----------- Flat-mapping -----------

    @Test
    void testFlatMapToString() {
        List<Integer> numbers = List.of(1, 2, 3);
        List<String> expected = List.of("1", "1", "2", "2", "3", "3");
        Matchers.containsInAnyOrder(expected, practice.flatMapToString(numbers));
    }

    @Test
    void testCrossProduct() {
        List<Integer> numbers = List.of(1, 2);
        String[] strings = {"a", "b"};
        List<Map.Entry<Integer, String>> expected = List.of(
                Map.entry(1, "a"), Map.entry(1, "b"),
                Map.entry(2, "a"), Map.entry(2, "b")
        );
        Matchers.containsInAnyOrder(expected, practice.crossProduct(numbers, strings));
    }

    @Test
    void testFlattenListOfLists() {
        List<List<Integer>> listOfLists = List.of(List.of(1, 2), List.of(3, 4));
        List<Integer> expected = List.of(1, 2, 3, 4);
        Matchers.containsInAnyOrder(expected, practice.flattenListOfLists(listOfLists));
    }

    @Test
    void testFlatMapKeyValue() {
        Map<Integer, List<String>> input = Map.of(1, List.of("a", "b"), 2, List.of("c", "d"));
        List<Map.Entry<Integer, String>> expected = List.of(
                Map.entry(1, "a"), Map.entry(1, "b"),
                Map.entry(2, "c"), Map.entry(2, "d")
        );
        Matchers.containsInAnyOrder(expected, practice.flatMapKeyValue(input));
    }
}
