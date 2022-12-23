package com.japzio;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Set Theory Exercise
 */

@Slf4j
public class App {
    public static void main( String[] args ) {
        log.info("Hello World!");

        Set<Integer> arr1 = Set.of(1, 2, 3, 4, 5, 6);
        Set<Integer> arr2 = Set.of(2, 4, 6, 8, 10);
        Set<Integer> arr3 = Set.of(1, 4, 6, 7, 10);

        log.info("set1={}, set2={}, set{}", arr1, arr2, arr3);
        log.info("intersection={}", intersections(arr1, arr2, arr3));
    }

    public static List<Integer> intersections(Set<Integer> arr1, Set<Integer> arr2, Set<Integer> arr3){

        Set<Integer> union1 = union(arr1, arr2);
        Set<Integer> union2 = union(arr2, arr3);

        return union1.stream().filter(union2::contains).collect(Collectors.toList());
    }

    public static Set<Integer> union(Set<Integer> a, Set<Integer> b) {
        return Stream.concat(a.stream(),b.stream())
                .collect(Collectors.toSet());
    }
}
